package vallegrande.edu.pe.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vallegrande.edu.pe.backend.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}