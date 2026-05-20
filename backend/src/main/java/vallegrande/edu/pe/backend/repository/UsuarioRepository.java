package vallegrande.edu.pe.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vallegrande.edu.pe.backend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}