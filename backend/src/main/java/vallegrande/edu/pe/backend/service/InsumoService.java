package vallegrande.edu.pe.backend.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import vallegrande.edu.pe.backend.model.Insumo;
import vallegrande.edu.pe.backend.repository.InsumoRepository;

@Service
public class InsumoService extends AbstractCrudService<Insumo> {
	public InsumoService(InsumoRepository repository) {
		super(repository);
	}
}