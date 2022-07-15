package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Estudiante estudiante = this.buscarPorId(id);
		this.entityManager.remove(estudiante);
	}

	@Override
	public Estudiante buscarPorNombreApellidoTyped(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery(
				"SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.apellido = :datoApellido ",
				Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		myTypedQuery.setParameter("datoApellido", apellido);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorEdadApellidoTyped(Integer edad, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery(
				"SELECT e FROM Estudiante e WHERE e.edad = :datoEdad AND e.apellido = :datoApellido ",
				Estudiante.class);
		myTypedQuery.setParameter("datoEdad", edad);
		myTypedQuery.setParameter("datoApellido", apellido);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreApellidoNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreApellido");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorEdadCarreraNamed(Integer edad, String carrera) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorEdadCarrera");
		myQuery.setParameter("datoEdad", edad);
		myQuery.setParameter("datoCarrera", carrera);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreApellidoTypedNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub datoCarrera
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreApellido",
				Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		myTypedQuery.setParameter("datoApellido", apellido);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorEdadCarreraTypedNamed(Integer edad, String carrera) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorEdadCarrera",
				Estudiante.class);
		myTypedQuery.setParameter("datoEdad", edad);
		myTypedQuery.setParameter("datoCarrera", carrera);
		return myTypedQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorNombreApellidoNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery(
				"SELECT * FROM estudiante WHERE estu_nombre = :datoNombre AND estu_apellido = :datoApellido",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorEdadCarreraNative(Integer edad, String carrera) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery(
				"SELECT * FROM estudiante WHERE estu_edad = :datoEdad AND estu_carrera = :datoCarrera",
				Estudiante.class);
		myQuery.setParameter("datoEdad", edad);
		myQuery.setParameter("datoCarrera", carrera);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreApellidoNamedNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager
				.createNamedQuery("Estudiante.buscarPorNombreApellidoNamedNative", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		myTypedQuery.setParameter("datoApellido", apellido);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorEdadCarreraNamedNative(Integer edad, String carrera) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager
				.createNamedQuery("Estudiante.buscarPorEdadCarreraNamedNative", Estudiante.class);
		myTypedQuery.setParameter("datoEdad", edad);
		myTypedQuery.setParameter("datoCarrera", carrera);
		;
		return myTypedQuery.getSingleResult();
	}

}
