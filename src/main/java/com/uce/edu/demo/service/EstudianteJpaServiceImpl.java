package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteEdadCarreraCont;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService{
	
	@Autowired
	private IEstudianteJpaRepository estudianteJpaRepository;

	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorId(id);
	}

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteJpaRepository.guardar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteJpaRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.estudianteJpaRepository.eliminar(id);
	}

	@Override
	public Estudiante buscarPorNombreApellidoTyped(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorNombreApellidoTyped(nombre, apellido);
	}
	
	@Override
	public Estudiante buscarPorEdadApellidoTyped(Integer edad, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorEdadApellidoTyped(edad, apellido);
	}

	@Override
	public Estudiante buscarPorNombreApellidoNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorNombreApellidoNamed(nombre, apellido);
	}
	
	@Override
	public Estudiante buscarPorEdadCarreraNamed(Integer edad, String carrera) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorEdadCarreraNamed(edad, carrera);
	}

	@Override
	public Estudiante buscarPorNombreApellidoTypedNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorNombreApellidoTypedNamed(nombre, apellido);
	}

	@Override
	public List<Estudiante> buscarPorEdadCarreraTypedNamed(Integer edad, String carrera) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorEdadCarreraTypedNamed(edad, carrera);
	}

	@Override
	public Estudiante buscarPorNombreApellidoNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorNombreApellidoNative(nombre, apellido);
	}

	@Override
	public Estudiante buscarPorEdadCarreraNative(Integer edad, String carrera) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorEdadCarreraNative(edad, carrera);
	}

	@Override
	public Estudiante buscarPorNombreApellidoNamedNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorNombreApellidoNamedNative(nombre, apellido);
	}

	@Override
	public Estudiante buscarPorEdadCarreraNamedNative(Integer edad, String carrera) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorEdadCarreraNamedNative(edad, carrera);
	}

	@Override
	public List<Estudiante> buscaDinamicamentePorNombreApellido(String nombre, String apellido, Integer edad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscaDinamicamentePorNombreApellido(nombre, apellido, edad);
	}

	@Override
	public List<Estudiante> buscaDinamicamentePorNombreCarrera(String nombre, String carrera, Integer edad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscaDinamicamentePorNombreCarrera(nombre, carrera, edad);
	}

	@Override
	public List<EstudianteSencillo> consultarPorCarreraSencilla(String carrera) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.consultarPorCarreraSencilla(carrera);
	}

	@Override
	public List<EstudianteEdadCarreraCont> consultarPorEdadCarreraCont() {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.consultarPorEdadCarreraCont();
	}

}
