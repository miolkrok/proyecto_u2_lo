package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.onetomany.Libro2;

public interface ILibro2Repository {

	public void insertar(Libro2 libro2);
	public Libro2 buscar(Integer id);
	
}
