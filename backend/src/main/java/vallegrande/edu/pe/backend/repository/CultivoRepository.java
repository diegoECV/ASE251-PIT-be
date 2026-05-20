package vallegrande.edu.pe.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vallegrande.edu.pe.backend.model.Cultivo;

public interface CultivoRepository extends JpaRepository<Cultivo, Long> {
}