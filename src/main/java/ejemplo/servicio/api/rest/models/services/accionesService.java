package ejemplo.servicio.api.rest.models.services;

import java.util.List;

import ejemplo.servicio.api.rest.models.entity.acciones;

public interface accionesService {
	public List<acciones> findAll();
	public acciones findById(Long cve_accion);
	public List<acciones> findByDescripcion(acciones a);
}
