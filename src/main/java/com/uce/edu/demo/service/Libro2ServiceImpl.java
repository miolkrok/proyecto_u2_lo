package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ILibro2Repository;
import com.uce.edu.demo.repository.modelo.onetomany.Libro2;

@Service
public class Libro2ServiceImpl implements ILibro2Service{

	@Autowired
	private ILibro2Repository libro2Repository;
	
	@Override
	public void insertar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.libro2Repository.insertar(libro2);
	}

	@Override
	public Libro2 buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.libro2Repository.buscar(id);
	}

}
