package com.uce.edu.demo.service.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.modelo.prueba.Propietario;
import com.uce.edu.demo.repository.prueba.IPropietarioRepo;

@Service
public class PropietarioServiceImpl implements IPropietarioService{
	
	@Autowired
	private IPropietarioRepo propietarioRepo;

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepo.crear(propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepo.buscar(cedula);
	}
	
	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepo.eliminar(cedula);
	}

	
}
