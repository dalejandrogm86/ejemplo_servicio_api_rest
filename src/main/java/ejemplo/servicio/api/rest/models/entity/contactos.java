package ejemplo.servicio.api.rest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="contactos")
public class contactos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idContacto;
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	@Column(name = "paterno", nullable = false, length = 100)
	private String paterno;
	@Column(name = "materno", nullable = false, length = 100)
	private String materno;
	@Column(name = "nombre_buscar", nullable = false, length = 200)
	private String nombre_buscar;
	@Column(name = "activo", nullable = false)
	private Integer activo;
	@Column(name = "email", nullable = false, length = 150)
	private String email;
	@Column(name = "fechaCreacion", nullable = false, length = 100)
	private String fechaCreacion;
	@Column(name = "fechaActualizacion", nullable = false, length = 100)
	private String fechaActualizacion;
	
	public Long getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(Long idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getNombre_buscar() {
		return nombre_buscar;
	}
	public void setNombre_buscar(String nombre_buscar) {
		this.nombre_buscar = nombre_buscar;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
	
}
