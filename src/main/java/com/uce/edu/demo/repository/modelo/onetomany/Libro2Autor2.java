package com.uce.edu.demo.repository.modelo.onetomany;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro2_autor2")
public class Libro2Autor2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
	@SequenceGenerator(name = "name_generator", sequenceName = "liau2_id_seq", allocationSize = 1)
	@Column(name = "liau_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "liau_id_libro2")
	private Libro2 libro2;
	
	@ManyToOne
	@JoinColumn(name = "auto_id_autor2")
	private Autor2 autor2;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Libro2 getLibro2() {
		return libro2;
	}
	public void setLibro2(Libro2 libro2) {
		this.libro2 = libro2;
	}
	public Autor2 getAutor2() {
		return autor2;
	}
	public void setAutor2(Autor2 autor2) {
		this.autor2 = autor2;
	}
	@Override
	public String toString() {
		return "Libro2Autor2 [libro2=" + libro2 + ", autor2=" + autor2 + "]";
	}
	
	

}
