package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Ciudadano;

public interface ICiudadanoRepository {
	
	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public void eliminar(Integer id);
	public Ciudadano buscarPorId(Integer id);

}
