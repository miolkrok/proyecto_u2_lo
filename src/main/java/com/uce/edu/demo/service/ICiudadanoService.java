package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

public interface ICiudadanoService {
	
	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public void eliminar(Integer id);
	public Ciudadano buscarPorId(Integer id);

}
