package com.idat.EC1JormanHuaman.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hospital_clientes")
public class HospitalCliente {
	
	@Id
	private HospitalClientePK fk = new HospitalClientePK();
	
	private Integer cantidad;

	public HospitalClientePK getFk() {
		return fk;
	}

	public void setFk(HospitalClientePK fk) {
		this.fk = fk;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}

@Embeddable
class HospitalClientePK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_hospital", nullable = false, unique = true)
	private Integer idHospital;
	
	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	
	public Integer getIdHospital() {
		return idHospital;
	}
	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	
}
