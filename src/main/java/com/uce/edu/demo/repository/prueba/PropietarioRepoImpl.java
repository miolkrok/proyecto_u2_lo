package com.uce.edu.demo.repository.prueba;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.prueba.Propietario;

@Repository
@Transactional
public class PropietarioRepoImpl implements IPropietarioRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
//		System.out.println("crear propietario: " +propietario);
		this.entityManager.persist(propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
//		System.out.println("se vehiculo buscado el vehiculo: " +cedula);
//		Propietario pro = new Propietario();
//		pro.setCedula(cedula);
//		pro.setApellido("ORTIZ");
//		pro.setFechaNacimiento(LocalDateTime.now());
//		pro.setNombre("LUIS");
//		return pro;
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Propietario p WHERE p.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		
		return (Propietario) jpqlQuery.getSingleResult();
	}
	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
//		System.out.println("eliminar propietario: " +cedula);
		Query myQuery = this.entityManager.createQuery("DELETE FROM Propietario p WHERE p.cedula = :datoCedula");
		myQuery.setParameter("datoCedula", cedula);
		
		myQuery.executeUpdate();
	}



}
