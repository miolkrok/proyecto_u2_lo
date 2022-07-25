package com.uce.edu.demo.repository.modelo.onetomany;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
	@SequenceGenerator(name = "name_generator", sequenceName = "pedi_id_seq", allocationSize = 1)
	@Column(name = "pedi_id")
	private Integer id;
	@Column(name = "pedi_numero_pedido")
	private String numeroPedido;
	@Column(name = "pedi_fecha_pedido")
	private LocalDateTime fechaPedido;
	@Column(name = "pedi_precio_total")
	private BigDecimal precioTotal;
	@ManyToOne
	@JoinColumn(name = "pedi_id_cliente")
	private Cliente cliente;
	
	//set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public LocalDateTime getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDateTime fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public BigDecimal getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(BigDecimal precioTotal) {
		this.precioTotal = precioTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", numeroPedido=" + numeroPedido + ", fechaPedido=" + fechaPedido + ", precioTotal="
				+ precioTotal + ", cliente=" + cliente + "]";
	}
}
