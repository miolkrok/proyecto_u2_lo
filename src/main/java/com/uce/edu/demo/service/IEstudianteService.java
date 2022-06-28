package com.uce.edu.demo.service;

import com.uce.edu.demo.to.Estudiante;

public interface IEstudianteService {
	
	public Estudiante buscarPorId(int id);
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(int id);
}
