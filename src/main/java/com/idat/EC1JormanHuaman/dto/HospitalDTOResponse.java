package com.idat.EC1JormanHuaman.dto;

public class HospitalDTOResponse {

	private Integer id;
	private String nombre;
	private String descripcionHospital;
	private String distritoHospital;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcionHospital() {
		return descripcionHospital;
	}
	public void setDescripcionHospital(String descripcionHospital) {
		this.descripcionHospital = descripcionHospital;
	}
	public String getDistritoHospital() {
		return distritoHospital;
	}
	public void setDistritoHospital(String distritoHospital) {
		this.distritoHospital = distritoHospital;
	}
	
}
