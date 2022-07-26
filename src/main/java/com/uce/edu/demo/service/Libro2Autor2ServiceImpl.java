package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ILibro2Autor2Repository;
import com.uce.edu.demo.repository.modelo.onetomany.Libro2Autor2;

@Service
public class Libro2Autor2ServiceImpl implements ILibro2Autor2Service{
	
	@Autowired
	private ILibro2Autor2Repository libro2Autor2Repository;
	
	@Autowired
	private ILibro2Service libro2Service;
	
	@Autowired
	private IAutor2Service autor2Service;

	@Override
	public void insertar(Integer idAutor, Integer idLibro) {
		// TODO Auto-generated method stub
		Libro2Autor2 liau = new Libro2Autor2();
		liau.setAutor2(this.autor2Service.buscar(idAutor));
		liau.setLibro2(this.libro2Service.buscar(idLibro));
		this.libro2Autor2Repository.insertar(liau);
	}



}
