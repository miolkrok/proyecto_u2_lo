package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Autor2;

@Repository
@Transactional
public class Autor2RepositoryImpl implements IAutor2Repository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Autor2 autor2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor2);
	}

	@Override
	public Autor2 buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Autor2.class, id);
	}

}
