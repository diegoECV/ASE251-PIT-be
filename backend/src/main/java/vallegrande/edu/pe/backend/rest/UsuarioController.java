package vallegrande.edu.pe.backend.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import vallegrande.edu.pe.backend.model.Usuario;
import vallegrande.edu.pe.backend.service.AbstractCrudService;
import vallegrande.edu.pe.backend.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuarios")
@Tag(name = "Usuarios", description = "CRUD base de usuarios")
@RequiredArgsConstructor
public class UsuarioController extends AbstractCrudController<Usuario> {
	private final UsuarioService service;

	@Override
	protected AbstractCrudService<Usuario> service() {
		return service;
	}
}