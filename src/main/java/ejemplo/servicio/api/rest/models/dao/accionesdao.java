package ejemplo.servicio.api.rest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ejemplo.servicio.api.rest.models.entity.acciones;

public interface accionesdao extends CrudRepository<acciones, Long>{

	@Query(value = "Select t.* FROM tblacciones a Where a.des_Accion like %?1% and activo=1",nativeQuery = true)
	public List<acciones> findByDescripcion(String desc);
	@Query(value = "Select t.* FROM tblacciones a Where a.des_Accion like %?1% and activo=?2",nativeQuery = true)
	public List<acciones> findByDescripcion(String desc,Integer activo);
}
