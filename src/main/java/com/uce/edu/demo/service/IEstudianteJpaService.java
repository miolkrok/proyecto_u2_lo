package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteJpaService {
	
	public Estudiante buscarPorId(int id);
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(int id);

}
