package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaJpaRepositoryImpl implements IPersonaJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Persona persona = this.buscarPorId(id);
		this.entityManager.remove(persona);
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);

		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myTypedQuery = this.entityManager
				.createQuery("SELECT p FROM Persona p WHERE p.cedula = :datoCedula ", Persona.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNamed(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula");
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTypedNamed(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myTypedQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula",
				Persona.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM persona WHERE pers_cedula = :datoCedula",
				Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNativeNamed(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myTypedQuery = this.entityManager.createNamedQuery("Persona.buscaPorCedulaNative",
				Persona.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaCriteriaAPI(String cedula) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Persona> myQuery = myBuilder.createQuery(Persona.class);

		// Root FROM
		Root<Persona> personaRoot = myQuery.from(Persona.class);
		myQuery.select(personaRoot).where(myBuilder.equal(personaRoot.get("cedula"), cedula));

		TypedQuery<Persona> typedQuery = this.entityManager.createQuery(myQuery);
		
		return typedQuery.getSingleResult();
	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);

		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorNombreApellidoTypedNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myTypedQuery = this.entityManager.createNamedQuery("Persona.buscarPorNombreApellido",
				Persona.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		myTypedQuery.setParameter("datoApellido", apellido);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);

		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);

		return jpqlQuery.getResultList();
	}

	@Override
	public int actualizarPorApellido(String genero, String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createQuery("UPDATE Persona p SET p.genero = : datoGenero WHERE p.apellido = :datoApellido");
		myQuery.setParameter("datoGenero", genero);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.executeUpdate();
	}

	@Override
	public int eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("DELETE FROM Persona p WHERE p.genero = :datoGenero");
		myQuery.setParameter("datoGenero", genero);

		return myQuery.executeUpdate();
	}

}
