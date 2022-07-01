package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteJpaRepository {
	
	public Estudiante buscarPorId(int id);
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(int id);

}
