package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.onetomany.Pedido;

public interface IPedidoRepository {

	public void insertar(Pedido pedido);

	public void actualizar(Pedido pedido);

	public Pedido buscaPedido(Integer id);

	public void eliminar(Integer id);

}
