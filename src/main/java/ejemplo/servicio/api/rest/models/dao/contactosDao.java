package ejemplo.servicio.api.rest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ejemplo.servicio.api.rest.models.entity.acciones;
import ejemplo.servicio.api.rest.models.entity.contactos;

public interface contactosDao extends CrudRepository<contactos , Long>{
	@Query(value = "Select c.* FROM contactos c Where c.nombre_buscar like %?1% and activo=1",nativeQuery = true)
	public List<contactos> findByDescripcion(String desc);
	@Query(value = "Select c.* FROM contactos c Where c.nombre_buscar like %?1% and activo=1",nativeQuery = true)
	public List<contactos> find(String desc);

	
}
