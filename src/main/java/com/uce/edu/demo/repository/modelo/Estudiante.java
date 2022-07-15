package com.uce.edu.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@NamedQuery(name = "Estudiante.buscarPorNombreApellido", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.apellido = :datoApellido")
@NamedQuery(name = "Estudiante.buscarPorEdadCarrera", query = "SELECT e FROM Estudiante e WHERE e.edad = :datoEdad AND e.carrera = :datoCarrera ")
@NamedNativeQueries({
		@NamedNativeQuery(name = "Estudiante.buscarPorNombreApellidoNamedNative", query = "SELECT * FROM estudiante WHERE estu_nombre = :datoNombre AND estu_apellido = :datoApellido",resultClass = Estudiante.class),
		@NamedNativeQuery(name = "Estudiante.buscarPorEdadCarreraNamedNative", query = "SELECT * FROM estudiante WHERE estu_edad = :datoEdad AND estu_carrera = :datoCarrera",resultClass = Estudiante.class) })
public class Estudiante {

	@Id
	@Column(name = "estu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
	@SequenceGenerator(name = "name_generator", sequenceName = "estu_id_seq", allocationSize = 1)
	private int id;
	@Column(name = "estu_nombre")
	private String nombre;
	@Column(name = "estu_apellido")
	private String apellido;
	@Column(name = "estu_edad")
	private int edad;
	@Column(name = "estu_carrera")
	private String carrera;

	// set y get
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
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
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", carrera=" + carrera + "]";
	}

}
