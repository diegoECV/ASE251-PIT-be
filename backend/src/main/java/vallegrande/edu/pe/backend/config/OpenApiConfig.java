package vallegrande.edu.pe.backend.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	OpenAPI customOpenApi() {
		return new OpenAPI()
				.info(new Info()
						.title("Backend - Sistema de Seguimiento de Producción por Parcela")
						.description("API base para revisar la conexión con SQL Server y luego exponer los módulos del sistema."))
				.externalDocs(new ExternalDocumentation()
						.description("Proyecto ASE251-PIT"));
	}
}