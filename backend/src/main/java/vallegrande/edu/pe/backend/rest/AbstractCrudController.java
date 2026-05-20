package vallegrande.edu.pe.backend.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.Operation;
import vallegrande.edu.pe.backend.model.AuditableEntity;
import vallegrande.edu.pe.backend.model.CrudEntity;
import vallegrande.edu.pe.backend.service.AbstractCrudService;

public abstract class AbstractCrudController<T extends AuditableEntity & CrudEntity> {
	protected abstract AbstractCrudService<T> service();

	@GetMapping
	@Operation(summary = "Lista todos los registros activos")
	public List<T> findAll() {
		return service().findAll();
	}

	@GetMapping("/{id}")
	@Operation(summary = "Busca un registro por id")
	public T findById(@PathVariable Long id) {
		return service().findById(id);
	}

	@PostMapping
	@Operation(summary = "Crea un registro")
	public ResponseEntity<T> create(@RequestBody T entity) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service().create(entity));
	}

	@PutMapping("/{id}")
	@Operation(summary = "Actualiza un registro existente")
	public T update(@PathVariable Long id, @RequestBody T entity) {
		return service().update(id, entity);
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Elimina lógicamente un registro")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service().delete(id);
		return ResponseEntity.noContent().build();
	}

	@PatchMapping("/{id}/restore")
	@Operation(summary = "Restaura un registro eliminado")
	public T restore(@PathVariable Long id) {
		return service().restore(id);
	}
}