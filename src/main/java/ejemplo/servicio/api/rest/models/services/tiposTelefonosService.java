package ejemplo.servicio.api.rest.models.services;

import java.util.List;

import ejemplo.servicio.api.rest.models.entity.tiposTelefonos;

public interface tiposTelefonosService {
	public List<tiposTelefonos> findAll();
	public tiposTelefonos findById(Long cveTipoTelefono);
	public List<tiposTelefonos> findByDescripcion(tiposTelefonos a);

}
