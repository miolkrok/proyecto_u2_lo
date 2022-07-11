package com.uce.edu.demo.service.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.modelo.prueba.Vehiculo;
import com.uce.edu.demo.repository.prueba.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private IVehiculoRepo vehiculoRepo;

	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.crear(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.eliminar(placa);
	}

}
