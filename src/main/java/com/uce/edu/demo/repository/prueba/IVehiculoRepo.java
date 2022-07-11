package com.uce.edu.demo.repository.prueba;

import com.uce.edu.demo.repository.modelo.prueba.Vehiculo;

public interface IVehiculoRepo {
	
	public void crear(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void actualizar(Vehiculo vehiculo);
	public void eliminar(String placa);

}
