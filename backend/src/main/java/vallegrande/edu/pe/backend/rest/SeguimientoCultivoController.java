package vallegrande.edu.pe.backend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import vallegrande.edu.pe.backend.model.SeguimientoCultivo;
import vallegrande.edu.pe.backend.service.AbstractCrudService;
import vallegrande.edu.pe.backend.service.SeguimientoCultivoService;

@RestController
@RequestMapping("/api/v1/seguimientos")
@Tag(name = "Seguimiento Cultivo", description = "CRUD base de seguimiento del cultivo")
@RequiredArgsConstructor
public class SeguimientoCultivoController extends AbstractCrudController<SeguimientoCultivo> {
	private final SeguimientoCultivoService service;

	@Override
	protected AbstractCrudService<SeguimientoCultivo> service() {
		return service;
	}
}