package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

public class EstudianteEdadCarreraCont implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private String carrera;
	private Integer edad;
	private long cantidad;

	public EstudianteEdadCarreraCont() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteEdadCarreraCont(Integer edad, long cantidad) {
		super();
//		this.carrera = carrera;
		this.edad = edad;
		this.cantidad = cantidad;
	}

//	public String getCarrera() {
//		return carrera;
//	}
//
//	public void setCarrera(String carrera) {
//		this.carrera = carrera;
//	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "EstudianteEdadCarreraCont [edad=" + edad + ", cantidad=" + cantidad + "]";
	}

}
