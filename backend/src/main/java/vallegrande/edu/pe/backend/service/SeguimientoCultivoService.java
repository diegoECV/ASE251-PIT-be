package vallegrande.edu.pe.backend.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import vallegrande.edu.pe.backend.model.SeguimientoCultivo;
import vallegrande.edu.pe.backend.repository.SeguimientoCultivoRepository;

@Service
public class SeguimientoCultivoService extends AbstractCrudService<SeguimientoCultivo> {
	public SeguimientoCultivoService(SeguimientoCultivoRepository repository) {
		super(repository);
	}
}