package vallegrande.edu.pe.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vallegrande.edu.pe.backend.model.Insumo;

public interface InsumoRepository extends JpaRepository<Insumo, Long> {
}