package vallegrande.edu.pe.backend.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import vallegrande.edu.pe.backend.model.Usuario;
import vallegrande.edu.pe.backend.repository.UsuarioRepository;

@Service
public class UsuarioService extends AbstractCrudService<Usuario> {
	public UsuarioService(UsuarioRepository repository) {
		super(repository);
	}
}