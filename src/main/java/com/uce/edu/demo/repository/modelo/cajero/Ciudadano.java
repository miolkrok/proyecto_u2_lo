package com.uce.edu.demo.repository.modelo.cajero;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "Ciudadano2")
@Table(name = "ciudadano2")
public class Ciudadano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
	@SequenceGenerator(name = "name_generator", sequenceName = "ciud2_id_seq", allocationSize = 1)
	@Column(name = "ciud_id")
	private Integer id;
	@Column(name = "ciud_nombre")
	private String nombre;
	@Column(name = "ciud_apellido")
	private String apellido;
	
	@OneToOne(mappedBy = "ciudadano",cascade = CascadeType.ALL)
	private Cliente cliente;

	//SET Y GET
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cliente=" + cliente + "]";
	}
	
	
	

}
