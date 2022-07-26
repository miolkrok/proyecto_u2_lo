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
@Table(name = "autor2")
public class Autor2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
	@SequenceGenerator(name = "name_generator", sequenceName = "auto2_id_seq", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;
	@Column(name = "auto_nombre")
	private String nombre;
	@OneToMany(mappedBy = "autor2",cascade = CascadeType.ALL)
	private List<Libro2Autor2> libro2Autor2;
	
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
	public List<Libro2Autor2> getLibro2Autor2() {
		return libro2Autor2;
	}
	public void setLibro2Autor2(List<Libro2Autor2> libro2Autor2) {
		this.libro2Autor2 = libro2Autor2;
	}
	@Override
	public String toString() {
		return "Autor2 [id=" + id + ", nombre=" + nombre + ", libro2Autor2=" + libro2Autor2 + "]";
	}
	
}
