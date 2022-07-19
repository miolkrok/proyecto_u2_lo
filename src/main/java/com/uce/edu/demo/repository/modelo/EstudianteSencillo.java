package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

public class EstudianteSencillo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String apellido;
	private Integer edad;
	private String carrera;
	
	public EstudianteSencillo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public EstudianteSencillo(String apellido, Integer edad, String carrera) {
		super();
		this.apellido = apellido;
		this.edad = edad;
		this.carrera = carrera;
	}


	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	@Override
	public String toString() {
		return "EstudianteSencillo [apellido=" + apellido + ", edad=" + edad + ", carrera=" + carrera + "]";
	}
	
	

}
