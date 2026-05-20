package vallegrande.edu.pe.backend.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import vallegrande.edu.pe.backend.model.Cultivo;
import vallegrande.edu.pe.backend.repository.CultivoRepository;

@Service
public class CultivoService extends AbstractCrudService<Cultivo> {
	public CultivoService(CultivoRepository repository) {
		super(repository);
	}
}