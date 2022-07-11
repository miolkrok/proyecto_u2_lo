package com.uce.edu.demo.repository.prueba;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.prueba.Propietario;
import com.uce.edu.demo.repository.modelo.prueba.Vehiculo;


@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
//		System.out.println("se ingreso el vehiculo: " +vehiculo);
		this.entityManager.persist(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
//		System.out.println("se vehiculo buscado el vehiculo: " +placa);
//		Vehiculo vehi = new Vehiculo();
//		vehi.setPlaca(placa);
//		vehi.setPrecio(new BigDecimal(20000));
//		vehi.setMarca("FORD");
//		vehi.setTipo("pesado");
//		return vehi;
		Query jpqlQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v WHERE v.placa = :datoPlaca");
		jpqlQuery.setParameter("datoPlaca", placa);
		
		return (Vehiculo) jpqlQuery.getSingleResult();
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
//		System.out.println("se ingreso el vehiculo: " +vehiculo);
		this.entityManager.merge(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
//		System.out.println("se elimino el vehiculo: " +placa);
		Query myQuery = this.entityManager.createQuery("DELETE FROM Vehiculo v WHERE v.placa = :datoPlaca");
		myQuery.setParameter("datoPlaca", placa);
		
		myQuery.executeUpdate();
	}

}
