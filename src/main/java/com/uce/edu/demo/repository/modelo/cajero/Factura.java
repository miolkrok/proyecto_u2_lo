package com.uce.edu.demo.repository.modelo.cajero;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
	@SequenceGenerator(name = "name_generator", sequenceName = "fact_id_seq", allocationSize = 1)
	@Column(name = "fact_id")
	private Integer id;
	@Column(name = "fact_fecha")
	private LocalDateTime fecha;
	@Column(name = "fact_numero")
	private String numero;
	@ManyToOne
	@JoinColumn(name = "fact_id_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "factura",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Detalle> detalleFact;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Detalle> getDetalleFact() {
		return detalleFact;
	}

	public void setDetalleFact(List<Detalle> detalleFact) {
		this.detalleFact = detalleFact;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", numero=" + numero + ", cliente=" + cliente
				+ ", detalleFact=" + detalleFact + "]";
	}





}
