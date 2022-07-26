package com.uce.edu.demo.repository.modelo.onetomany;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro2")
public class Libro2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
	@SequenceGenerator(name = "name_generator", sequenceName = "libr2_id_seq", allocationSize = 1)
	@Column(name = "libr_id")
	private Integer id;
	@Column(name = "libr_titulo")
	private String titulo;
	@Column(name = "libr_cantidad_paginas")
	private Integer cantidadPaginas;
	@OneToMany(mappedBy = "libro2",cascade = CascadeType.ALL)
	private List<Libro2Autor2> libro2Autor2;
	
	//SET Y GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getCantidadPaginas() {
		return cantidadPaginas;
	}
	public void setCantidadPaginas(Integer cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	public List<Libro2Autor2> getLibro2Autor2() {
		return libro2Autor2;
	}
	public void setLibro2Autor2(List<Libro2Autor2> libro2Autor2) {
		this.libro2Autor2 = libro2Autor2;
	}
	@Override
	public String toString() {
		return "Libro2 [id=" + id + ", titulo=" + titulo + ", cantidadPaginas=" + cantidadPaginas + ", libro2Autor2="
				+ libro2Autor2 + "]";
	}
	
}
