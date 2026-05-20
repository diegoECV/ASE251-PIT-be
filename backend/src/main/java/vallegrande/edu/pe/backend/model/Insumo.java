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
@Table(name = "insumos")
public class Insumo extends AuditableEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_insumo")
	private Long id;

	@Column(name = "nombre", nullable = false, length = 120)
	private String nombre;

	@Column(name = "tipo_insumo", nullable = false, length = 100)
	private String tipoInsumo;

	@Column(name = "unidad_medida", nullable = false, length = 20)
	private String unidadMedida;

	@Column(name = "proveedor", length = 150)
	private String proveedor;

	@Column(name = "costo", nullable = false, precision = 12, scale = 2)
	private BigDecimal costo;

	@Column(name = "cantidad", nullable = false, precision = 12, scale = 3)
	private BigDecimal cantidad;
}