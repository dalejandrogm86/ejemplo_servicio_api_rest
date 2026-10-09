package ejemplo.servicio.api.rest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "tblacciones")
@Table(name = "tblacciones")
public class acciones {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cve_Accion")
	private Long cve_Accion;
	@Column(name = "des_Accion")
	private String des_Accion;
	@Column(name = "activo")
	private Integer activo;
	
	
	public Long getCve_Accion() {
		return cve_Accion;
	}
	public void setCve_Accion(Long cve_Accion) {
		this.cve_Accion = cve_Accion;
	}
	public String getDes_Accion() {
		return des_Accion;
	}
	public void setDes_Accion(String des_Accion) {
		this.des_Accion = des_Accion;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
}
