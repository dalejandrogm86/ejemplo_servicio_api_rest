package ejemplo.servicio.api.rest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="telefonos_contactos")
public class telefonos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_telefono_contacto;
	@Column(name = "telefono", nullable = false, length = 15)
	private String telefono;
	@Column(name = "activo", nullable = false)
	private Boolean activo;
	@Column(name = "fechaCreacion", nullable = false)
	private String fechaCreacion;
	@Column(name = "fechaActualizacion", nullable = false)
	private String fechaActualizacion;
	@Column(name = "cveTipoTelefono", nullable = false)
	private Long cveTipoTelefono;
	public Long getId_telefono_contacto() {
		return id_telefono_contacto;
	}
	public void setId_telefono_contacto(Long id_telefono_contacto) {
		this.id_telefono_contacto = id_telefono_contacto;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
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
	public Long getCveTipoTelefono() {
		return cveTipoTelefono;
	}
	public void setCveTipoTelefono(Long cveTipoTelefono) {
		this.cveTipoTelefono = cveTipoTelefono;
	}
	
	
}
