package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPedidoRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Pedido;

@Service
public class PedidoServiceImpl implements IPedidoService{

	@Autowired
	private IPedidoRepository pedidoRepository;
	
	@Override
	public void insertar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedidoRepository.insertar(pedido);
	}

	@Override
	public void actualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedidoRepository.actualizar(pedido);
	}

	@Override
	public Pedido buscaPedido(Integer id) {
		// TODO Auto-generated method stub
		return this.pedidoRepository.buscaPedido(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.pedidoRepository.eliminar(id);
	}

}
