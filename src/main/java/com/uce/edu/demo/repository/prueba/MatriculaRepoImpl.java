package com.uce.edu.demo.repository.prueba;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.prueba.MatriculaVehiculos;



@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(MatriculaVehiculos matriculaVehiculos) {
		// TODO Auto-generated method stub
//		System.out.println("Se crea la matricula: " +matriculaVehiculos);
		this.entityManager.persist(matriculaVehiculos);
	}

}
