package ejemplo.servicio.api.rest.models.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ejemplo.servicio.api.rest.models.dao.contactosDao;
import ejemplo.servicio.api.rest.models.entity.contactos;
import ejemplo.servicio.api.rest.models.services.contactosService;

@Service
public class contactosServiceImpl implements contactosService{

	private final contactosDao concatosdao;

	contactosServiceImpl(contactosDao concatosdao) {
		this.concatosdao = concatosdao;
	}
	@Override
	@Transactional(readOnly = true)
	public List<contactos> findAll() {
		List<contactos> data = null;
		try {
			data = ( List<contactos>) concatosdao.findAll();
			if(data.isEmpty()==true) {
			  System.out.println("No se encontraron contactos en el sistema");
			}
			return data;
		}catch (Exception e) {
			System.err.println("Ocurrio un error al realizar la consulta " + e.getMessage());
		}
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public contactos findById(Long id_contacto) {
		contactos data=null;
		try {
			data = concatosdao.findById(id_contacto).orElse(null);
			if(data.equals(null)) {
				System.out.println("No se localizo el contacto en el sistema");
			}
			return data;
		}catch (Exception e) {
			System.err.println("Ocurrio un error al realizar la consulta por clave " + e.getMessage());
		}
		return data;
	}

	@Override
	@Transactional(readOnly = true)
	public List<contactos> findByDescripcion(contactos t) {
		List<contactos> data=null;
		try {
			if( t.getActivo()!=null ) {
				data = concatosdao.findByDescripcion(t.getNombre_buscar());
			}else {
				data = concatosdao.findByDescripcion(t.getNombre_buscar());
			}
			
			System.out.println(t.getNombre_buscar());
			if(data.isEmpty()) {
				System.out.println("No se encontraron coincidencias en el sistema");
			}
			return data;
		}catch (Exception e) {
			System.err.println("Ocurrio un error al realizar la consulta por clave " + e.getMessage());
		}
		return data;
	}
	@Override
	public List<contactos> findByNames(String a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public contactos delete(contactos c) {
		contactos data=null;
		try {
			System.out.println(c.getNombre());
			System.out.println(c.getActivo());
			data = concatosdao.save(c);
			if(data.equals(null)) {
				System.out.println("No se localizo el contacto en el sistema");
			}
			return data;
		}catch (Exception e) {
			System.err.println("Ocurrio un error al realizar la consulta por clave " + e.getMessage());
		}
		return data;
	}
	
	

}
