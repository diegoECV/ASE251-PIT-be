package vallegrande.edu.pe.backend.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import vallegrande.edu.pe.backend.model.Parcela;
import vallegrande.edu.pe.backend.repository.ParcelaRepository;

@Service
public class ParcelaService extends AbstractCrudService<Parcela> {
	public ParcelaService(ParcelaRepository repository) {
		super(repository);
	}
}