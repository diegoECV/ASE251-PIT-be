package vallegrande.edu.pe.backend.model;

import java.time.LocalDateTime;

public interface CrudEntity {
	Long getId();

	void setId(Long id);

	Boolean getEstado();

	void setEstado(Boolean estado);

	LocalDateTime getCreatedAt();

	void setCreatedAt(LocalDateTime createdAt);

	LocalDateTime getUpdatedAt();

	void setUpdatedAt(LocalDateTime updatedAt);

	LocalDateTime getDeletedAt();

	void setDeletedAt(LocalDateTime deletedAt);

	LocalDateTime getRestoredAt();

	void setRestoredAt(LocalDateTime restoredAt);
}