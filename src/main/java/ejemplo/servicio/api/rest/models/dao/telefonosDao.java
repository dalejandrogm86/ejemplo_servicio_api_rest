package ejemplo.servicio.api.rest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ejemplo.servicio.api.rest.models.entity.telefonos;

public interface telefonosDao extends CrudRepository<telefonos, Long>{
   
}
