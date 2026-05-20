package vallegrande.edu.pe.backend.rest.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Respuesta de verificación de conexión con la base de datos")
public record ConnectionStatusResponse(
		@Schema(description = "Estado general") String status,
		@Schema(description = "Mensaje descriptivo") String message,
		@Schema(description = "Nombre del motor detectado") String databaseProduct,
		@Schema(description = "URL activa de conexión") String url) {
}