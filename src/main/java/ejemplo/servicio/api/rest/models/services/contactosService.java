package ejemplo.servicio.api.rest.models.services;

import java.util.List;

import ejemplo.servicio.api.rest.models.entity.contactos;

public interface contactosService {
	public List<contactos> findAll();
	public contactos findById(Long id_contactos);
	public List<contactos> findByDescripcion(contactos a);
	public List<contactos> findByNames(String a);
	public contactos delete(contactos c);
	
}
