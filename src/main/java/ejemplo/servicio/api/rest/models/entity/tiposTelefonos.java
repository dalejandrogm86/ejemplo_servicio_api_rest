package ejemplo.servicio.api.rest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_telefonos")
public class tiposTelefonos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cve_tipo_telefono;
	
	@Column(name = "desc_tipo_telefono",length = 100, nullable = false)
	private String desc_tipo_telefono;
	@Column(name = "activo", nullable = false)
	private Boolean activo;
	public Long getCve_tipo_telefono() {
		return cve_tipo_telefono;
	}
	public void setCve_tipo_telefono(Long cve_tipo_telefono) {
		this.cve_tipo_telefono = cve_tipo_telefono;
	}
	public String getDesc_tipo_telefono() {
		return desc_tipo_telefono;
	}
	public void setDesc_tipo_telefono(String desc_tipo_telefono) {
		this.desc_tipo_telefono = desc_tipo_telefono;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
}
