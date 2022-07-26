package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Libro2;

@Repository
@Transactional
public class Libro2RepositoryImpl implements ILibro2Repository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro2);
	}

	@Override
	public Libro2 buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro2.class, id);
	}

}
