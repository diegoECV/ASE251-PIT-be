package vallegrande.edu.pe.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vallegrande.edu.pe.backend.model.Parcela;

public interface ParcelaRepository extends JpaRepository<Parcela, Long> {
}