package com.uce.edu.demo.repository.modelo.cajero;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "Cliente2")
@Table(name = "cliente2")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
	@SequenceGenerator(name = "name_generator", sequenceName = "clie2_id_seq", allocationSize = 1)
	@Column(name = "clie_id")
	private Integer id;
	@Column(name = "clie_numero_tarjeta")
	private String numeroTarjeta;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clie_id_ciudadano")
	private Ciudadano ciudadano;
	
	@OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
	private List<Factura> factura;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", ciudadano=" + ciudadano + "]";
	}
	
	
}
