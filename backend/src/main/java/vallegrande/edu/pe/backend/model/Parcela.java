package vallegrande.edu.pe.backend.model;

import java.math.BigDecimal;

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
@Table(name = "parcelas")
public class Parcela extends AuditableEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_parcela")
	private Long id;

	@Column(name = "nombre", nullable = false, length = 120)
	private String nombre;

	@Column(name = "direccion_geografica", length = 250)
	private String direccionGeografica;

	@Column(name = "disponibilidad", nullable = false)
	private Boolean disponibilidad;

	@Column(name = "area", nullable = false, precision = 12, scale = 2)
	private BigDecimal area;

	@Column(name = "observaciones", length = 500)
	private String observaciones;

	@Column(name = "id_cultivo")
	private Long idCultivo;

	@Column(name = "id_seguimiento_actual")
	private Long idSeguimientoActual;

	@Column(name = "id_usuario")
	private Long idUsuario;

	@Column(name = "id_insumo")
	private Long idInsumo;
}