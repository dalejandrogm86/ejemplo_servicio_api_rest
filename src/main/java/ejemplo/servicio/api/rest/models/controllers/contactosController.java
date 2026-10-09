package ejemplo.servicio.api.rest.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejemplo.servicio.api.rest.models.entity.contactos;
import ejemplo.servicio.api.rest.models.services.contactosService;

@RestController
@RequestMapping("/agenda/contactos")
public class contactosController {
	
	@Autowired
	private contactosService tipoNumeroService;
	
	@GetMapping("/getList")
	public ResponseEntity<List<contactos>> listar(){
		try {
			List<contactos> data;
			data = tipoNumeroService.findAll();
			if(data.isEmpty()) {
				return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(data,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getList/{idContacto}")
	public ResponseEntity<contactos> listar(@PathVariable Long idContacto){
		try {
			Optional<contactos> data;
			data = Optional.of(tipoNumeroService.findById(idContacto));
			if(data.isPresent()) {
				return new ResponseEntity<>(data.get(), HttpStatus.OK);
			}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/contactos/{idContacto}")
	public ResponseEntity<contactos> listar(@PathVariable Long idContacto){
		try {
			Optional<contactos> data;
			data = Optional.of(tipoNumeroService.(idContacto));
			if(data.isPresent()) {
				return new ResponseEntity<>(data.get(), HttpStatus.OK);
			}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/searchfor")
	public ResponseEntity<List<contactos>> buscar(@RequestBody contactos t){
		try {
			System.out.println(t.getNombre_buscar());
			List<contactos> data;
			data = tipoNumeroService.findByDescripcion(t);
			if(data.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity<>(data, HttpStatus.OK);
			
			}
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<contactos> delete(@RequestBody contactos t){
		try {			
			Optional<contactos> data;
			t.setActivo(0);
			data = Optional.of(tipoNumeroService.delete(t));
			if(data.isPresent()) {
				return new ResponseEntity<>(data.get(), HttpStatus.OK);
			}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/actualiza")
	public ResponseEntity<contactos> guardar(@RequestBody contactos t){
		try {			
			Optional<contactos> data;
			t.setActivo(0);
			data = Optional.of(tipoNumeroService.delete(t));
			if(data.isPresent()) {
				return new ResponseEntity<>(data.get(), HttpStatus.OK);
			}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
