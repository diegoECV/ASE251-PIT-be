package vallegrande.edu.pe.backend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import vallegrande.edu.pe.backend.model.Cultivo;
import vallegrande.edu.pe.backend.service.AbstractCrudService;
import vallegrande.edu.pe.backend.service.CultivoService;

@RestController
@RequestMapping("/api/v1/cultivos")
@Tag(name = "Cultivos", description = "CRUD base de cultivos")
@RequiredArgsConstructor
public class CultivoController extends AbstractCrudController<Cultivo> {
	private final CultivoService service;

	@Override
	protected AbstractCrudService<Cultivo> service() {
		return service;
	}
}