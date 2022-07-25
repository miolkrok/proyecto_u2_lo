package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.onetomany.Cliente;

public interface IClienteService {
	
	public void insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscaCliente(Integer id);
	public void eliminar(Integer id);

}
