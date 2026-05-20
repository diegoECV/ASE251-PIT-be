package vallegrande.edu.pe.backend.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import vallegrande.edu.pe.backend.model.Categoria;
import vallegrande.edu.pe.backend.repository.CategoriaRepository;

@Service
public class CategoriaService extends AbstractCrudService<Categoria> {
	public CategoriaService(CategoriaRepository repository) {
		super(repository);
	}
}