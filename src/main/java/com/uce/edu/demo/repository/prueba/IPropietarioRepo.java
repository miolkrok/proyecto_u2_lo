package com.uce.edu.demo.repository.prueba;

import com.uce.edu.demo.repository.modelo.prueba.Propietario;

public interface IPropietarioRepo {
	
	public void crear(Propietario propietario);
	public Propietario buscar(String cedula);
	public void eliminar(String cedula);

}
