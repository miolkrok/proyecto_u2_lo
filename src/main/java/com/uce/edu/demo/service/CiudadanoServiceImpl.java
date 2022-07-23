package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICiudadanoRepository;
import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	@Autowired
	private ICiudadanoRepository ciudadanoRepository;

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.insertar(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.actualizar(ciudadano);
	}

	@Override
	public Ciudadano buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.buscarPorId(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.eliminar(id);
	}

}
