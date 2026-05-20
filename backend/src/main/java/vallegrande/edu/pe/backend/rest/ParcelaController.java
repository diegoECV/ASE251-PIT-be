package vallegrande.edu.pe.backend.rest;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import vallegrande.edu.pe.backend.model.Parcela;
import vallegrande.edu.pe.backend.service.AbstractCrudService;
import vallegrande.edu.pe.backend.service.ParcelaService;

@RestController
@RequestMapping("/api/v1/parcelas")
@Tag(name = "Parcelas", description = "CRUD base de parcelas")
@RequiredArgsConstructor
public class ParcelaController extends AbstractCrudController<Parcela> {
	private final ParcelaService service;

	@Override
	protected AbstractCrudService<Parcela> service() {
		return service;
	}
}