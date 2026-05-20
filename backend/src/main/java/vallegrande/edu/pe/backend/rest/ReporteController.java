package vallegrande.edu.pe.backend.rest;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import vallegrande.edu.pe.backend.model.Reporte;
import vallegrande.edu.pe.backend.service.AbstractCrudService;
import vallegrande.edu.pe.backend.service.ReporteService;

@RestController
@RequestMapping("/api/v1/reportes")
@Tag(name = "Reportes", description = "CRUD base de reportes")
@RequiredArgsConstructor
public class ReporteController extends AbstractCrudController<Reporte> {
	private final ReporteService service;

	@Override
	protected AbstractCrudService<Reporte> service() {
		return service;
	}

	@GetMapping(value = "/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<byte[]> exportReportePdf() throws IOException {
		byte[] pdf = service.exportPdf();
		return ResponseEntity.ok()
			.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=reportes.pdf")
			.contentType(MediaType.APPLICATION_PDF)
			.body(pdf);
	}
}