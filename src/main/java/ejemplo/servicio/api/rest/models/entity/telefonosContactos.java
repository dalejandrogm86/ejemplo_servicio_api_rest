package ejemplo.servicio.api.rest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactos_telefonos")
public class telefonosContactos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_contactos_telefonos;
	@Column(name = "id_contacto")
	private Long id_contacto;
	@Column(name = "id_telefonos_contactos")
	private Long id_telefonos_contactos;
	@Column(name = "activo")
	private Boolean activo;
	public Long getId_contactos_telefonos() {
		return id_contactos_telefonos;
	}
	public void setId_contactos_telefonos(Long id_contactos_telefonos) {
		this.id_contactos_telefonos = id_contactos_telefonos;
	}
	public Long getId_contacto() {
		return id_contacto;
	}
	public void setId_contacto(Long id_contacto) {
		this.id_contacto = id_contacto;
	}
	public Long getId_telefonos_contactos() {
		return id_telefonos_contactos;
	}
	public void setId_telefonos_contactos(Long id_telefonos_contactos) {
		this.id_telefonos_contactos = id_telefonos_contactos;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
}
