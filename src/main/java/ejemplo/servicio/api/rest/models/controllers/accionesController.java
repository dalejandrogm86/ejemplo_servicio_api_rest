package ejemplo.servicio.api.rest.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejemplo.servicio.api.rest.models.entity.acciones;
import ejemplo.servicio.api.rest.models.implement.accionesServiceImpl;


@RestController
@RequestMapping("/catalogos/acciones")
public class accionesController {
	
	@Autowired
	private accionesServiceImpl tipoNumeroService;
	
	@GetMapping("/getList")
	public ResponseEntity<List<acciones>> listar(){
		try {
			List<acciones> data;
			data = tipoNumeroService.findAll();
			if(data.isEmpty()) {
				return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(data,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getList/{cveTipoNumero}")
	public ResponseEntity<acciones> listar(@PathVariable Long cveTipoNumero){
		try {
			Optional<acciones> data;
			data = Optional.of(tipoNumeroService.findById(cveTipoNumero));
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
	public ResponseEntity<List<acciones>> buscar(@RequestBody acciones t){
		try {
			System.out.println(t.getDes_Accion());
			List<acciones> data;
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
}
