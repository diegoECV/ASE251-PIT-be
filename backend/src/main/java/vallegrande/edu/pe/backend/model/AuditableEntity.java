package vallegrande.edu.pe.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AuditableEntity implements CrudEntity {
	@Column(name = "estado", nullable = false)
	private Boolean estado = Boolean.TRUE;

	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;

	@Column(name = "restored_at")
	private LocalDateTime restoredAt;

	@PrePersist
	void onCreate() {
		LocalDateTime now = LocalDateTime.now();
		if (createdAt == null) {
			createdAt = now;
		}
		updatedAt = now;
		if (estado == null) {
			estado = Boolean.TRUE;
		}
	}

	@PreUpdate
	void onUpdate() {
		updatedAt = LocalDateTime.now();
	}

	public void markDeleted() {
		estado = Boolean.FALSE;
		deletedAt = LocalDateTime.now();
		updatedAt = LocalDateTime.now();
	}

	public void markRestored() {
		estado = Boolean.TRUE;
		deletedAt = null;
		restoredAt = LocalDateTime.now();
		updatedAt = LocalDateTime.now();
	}
}