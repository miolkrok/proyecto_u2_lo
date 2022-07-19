package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteEdadCarreraCont;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;

public interface IEstudianteJpaService {
	
	public Estudiante buscarPorId(int id);
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(int id);
	public Estudiante buscarPorNombreApellidoTyped(String nombre,String apellido);
	public Estudiante buscarPorEdadApellidoTyped(Integer edad, String apellido);
	public Estudiante buscarPorNombreApellidoNamed(String nombre,String apellido);
	public Estudiante buscarPorEdadCarreraNamed(Integer edad,String carrera);
	public Estudiante buscarPorNombreApellidoTypedNamed(String nombre,String apellido);
	public List<Estudiante> buscarPorEdadCarreraTypedNamed(Integer edad,String carrera);
	public Estudiante buscarPorNombreApellidoNative(String nombre, String apellido);
	public Estudiante buscarPorEdadCarreraNative(Integer edad,String carrera);
	public Estudiante buscarPorNombreApellidoNamedNative(String nombre,String apellido);
	public Estudiante buscarPorEdadCarreraNamedNative(Integer edad,String carrera);
	public List<Estudiante> buscaDinamicamentePorNombreApellido(String nombre,String apellido,Integer edad);
	public List<Estudiante> buscaDinamicamentePorNombreCarrera(String nombre,String carrera,Integer edad);
	public List<EstudianteSencillo> consultarPorCarreraSencilla(String carrera);
	public List<EstudianteEdadCarreraCont> consultarPorEdadCarreraCont(); 
}
