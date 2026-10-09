package ejemplo.servicio.api.rest.models.services;

import java.util.List;

import ejemplo.servicio.api.rest.models.entity.telefonos;

public interface telefonosService {
	public List<telefonos> findAll();
	public telefonos findById(Long id_telefono_contacto);
	public List<telefonos> findByDescripcion(telefonos a);

}
