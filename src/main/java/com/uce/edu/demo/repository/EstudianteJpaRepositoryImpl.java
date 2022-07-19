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

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteEdadCarreraCont;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;
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

	@Override
	public List<Estudiante> buscaDinamicamentePorNombreApellido(String nombre, String apellido, Integer edad) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);

		Root<Estudiante> myTabla = myQuery.from(Estudiante.class);

		Predicate predNombre = myBuilder.equal(myTabla.get("nombre"), nombre);
		Predicate predApellido = myBuilder.equal(myTabla.get("apellido"), apellido);
		Predicate predEdad = myBuilder.equal(myTabla.get("edad"), edad);
		Predicate miPredicadoFinal = null;

		if (edad == 23) {
			miPredicadoFinal = myBuilder.or(predNombre, predApellido);
			myBuilder.and(miPredicadoFinal, predEdad);
		} else {
			miPredicadoFinal = myBuilder.and(predNombre, predApellido);
			myBuilder.or(miPredicadoFinal, predEdad);
		}

		CriteriaQuery<Estudiante> myQueryCompleto = myQuery.select(myTabla).where(miPredicadoFinal);
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQueryCompleto);
		return myQueryFinal.getResultList();
	}

	@Override
	public List<Estudiante> buscaDinamicamentePorNombreCarrera(String nombre, String carrera, Integer edad) {
		// TODO Auto-generated method stub

		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);

		Root<Estudiante> myTabla = myQuery.from(Estudiante.class);

		Predicate predNombre = myBuilder.equal(myTabla.get("nombre"), nombre);
		Predicate predCarrera = myBuilder.equal(myTabla.get("carrera"), carrera);
		Predicate miPredicadoFinal = null;

		if (edad == 23) {
			miPredicadoFinal = myBuilder.or(predNombre, predCarrera);
		} else {
			miPredicadoFinal = myBuilder.and(predNombre, predCarrera);
		}

		CriteriaQuery<Estudiante> myQueryCompleto = myQuery.select(myTabla).where(miPredicadoFinal);
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQueryCompleto);
		return myQueryFinal.getResultList();
	}

	@Override
	public List<EstudianteSencillo> consultarPorCarreraSencilla(String carrera) {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteSencillo> myTypedQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repository.modelo.EstudianteSencillo(e.apellido, e.edad, e.carrera) FROM Estudiante e WHERE e.carrera = :datoCarrera",
				EstudianteSencillo.class);
		myTypedQuery.setParameter("datoCarrera", carrera);

		return myTypedQuery.getResultList();
	}

	@Override
	public List<EstudianteEdadCarreraCont> consultarPorEdadCarreraCont() {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteEdadCarreraCont> myTypedQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repository.modelo.EstudianteEdadCarreraCont(e.edad,COUNT(e.edad)) FROM Estudiante e WHERE e.edad > 20 GROUP BY e.edad",
				EstudianteEdadCarreraCont.class);

		return myTypedQuery.getResultList();
	}

}
