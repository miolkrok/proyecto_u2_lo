package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Cliente;
import com.uce.edu.demo.repository.modelo.onetomany.Pedido;

@Repository
@Transactional
public class PedidoRepositoryImpl implements IPedidoRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pedido);
	}

	@Override
	public void actualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pedido);
	}

	@Override
	public Pedido buscaPedido(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Pedido.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscaPedido(id));
	}
	

}
