package ejemplo.servicio.api.rest.models.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ejemplo.servicio.api.rest.models.dao.accionesdao;
import ejemplo.servicio.api.rest.models.entity.acciones;
import ejemplo.servicio.api.rest.models.services.accionesService;

@Service
public class accionesServiceImpl implements accionesService {

	@Autowired
	private accionesdao accionesdao;
	@Override
	@Transactional(readOnly = true)
	public List<acciones> findAll() {
		List<acciones> data = null;
		try {
			data = ( List<acciones>) accionesdao.findAll();
			if(data.isEmpty()==true) {
			  System.out.println("No se encontraron registros del catalogo acciones");
			}
			return data;
		}catch (Exception e) {
			System.err.println("Ocurrio un error al realizar la consulta " + e.getMessage());
		}
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public acciones findById(Long cve_accion) {
		acciones data=null;
		try {
			data = accionesdao.findById(cve_accion).orElse(null);
			if(data.equals(null)) {
				System.out.println("No se encontraron registros del catalogo acciones");
			}
			return data;
		}catch (Exception e) {
			System.err.println("Ocurrio un error al realizar la consulta por clave " + e.getMessage());
		}
		return data;
	}

	@Override
	@Transactional(readOnly = true)
	public List<acciones> findByDescripcion(acciones t) {
		List<acciones> data=null;
		try {
			if( t.getActivo()!=null ) {
				data = accionesdao.findByDescripcion(t.getDes_Accion(),t.getActivo());
			}else {
				data = accionesdao.findByDescripcion(t.getDes_Accion());
			}
			
			System.out.println(t.getDes_Accion());
			if(data.isEmpty()) {
				System.out.println("No se encontraron registros del catalogo acciones");
			}
			return data;
		}catch (Exception e) {
			System.err.println("Ocurrio un error al realizar la consulta por clave " + e.getMessage());
		}
		return data;
	}

}
