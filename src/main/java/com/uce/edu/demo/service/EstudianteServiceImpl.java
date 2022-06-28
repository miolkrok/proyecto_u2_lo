package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEstudianteRepository;
import com.uce.edu.demo.to.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorId(id);
	}

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(id);
		
	}

}
