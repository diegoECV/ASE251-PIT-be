package vallegrande.edu.pe.backend.rest;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import vallegrande.edu.pe.backend.rest.dto.ConnectionStatusResponse;

@RestController
@RequestMapping("/api/v1/system")
@RequiredArgsConstructor
@Tag(name = "Sistema", description = "Verificación del estado del backend y la base de datos")
public class SystemController {

	private final JdbcTemplate jdbcTemplate;

	@GetMapping("/db-connection")
	@Operation(summary = "Verifica la conexión con SQL Server")
	public ResponseEntity<ConnectionStatusResponse> checkDatabaseConnection() {
		try {
			return jdbcTemplate.execute((Connection connection) -> {
				DatabaseMetaData metaData = connection.getMetaData();
				String url = metaData.getURL();
				String databaseProduct = metaData.getDatabaseProductName();
				return ResponseEntity.ok(new ConnectionStatusResponse(
						"UP",
						"Conexión correcta con la base de datos",
						databaseProduct,
						url));
			});
		} catch (RuntimeException ex) {
			return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
					.body(new ConnectionStatusResponse(
							"DOWN",
							"No se pudo conectar con SQL Server",
							"SQL Server",
							null));
		}
	}
}