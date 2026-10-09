package ejemplo.servicio.api.rest.models.services;

import java.util.List;

import ejemplo.servicio.api.rest.models.entity.telefonosContactos;

public interface telefonosContactosService {
	public List<telefonosContactos> findAll();
	public telefonosContactos findById(Long id_Telefono_contacto);
	public List<telefonosContactos> findByDescripcion(telefonosContactos a);

}
