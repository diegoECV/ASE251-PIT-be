package vallegrande.edu.pe.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reportes")
public class Reporte extends AuditableEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reporte")
	private Long id;

	@Column(name = "nombre_reporte", nullable = false, length = 150)
	private String nombreReporte;

	@Column(name = "id_parcela", nullable = false)
	private Long idParcela;
}