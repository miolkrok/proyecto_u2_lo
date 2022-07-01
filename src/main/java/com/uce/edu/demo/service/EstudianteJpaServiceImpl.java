package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService{
	
	@Autowired
	private IEstudianteJpaRepository estudianteJpaRepository;

	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorId(id);
	}

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteJpaRepository.guardar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteJpaRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.estudianteJpaRepository.eliminar(id);
	}

}
