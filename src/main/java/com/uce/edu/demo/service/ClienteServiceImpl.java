package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IClienteRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepository clienteRepository;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepository.insertar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepository.actualizar(cliente);
	}

	@Override
	public Cliente buscaCliente(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepository.buscaCliente(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepository.eliminar(id);
	}

}
