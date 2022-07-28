package com.uce.edu.demo.repository.modelo.prueba;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@Column(name = "vehi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
	@SequenceGenerator(name = "name_generator", sequenceName = "vehi_id_seq", allocationSize = 1)
	private Integer id;
	@Column(name = "vehi_marca")
	private String marca;
	@Column(name = "vehi_placa")
	private String placa;
	@Column(name = "vehi_tipo")
	private String tipo;
	@Column(name = "vehi_precio")
	private BigDecimal precio;
	@OneToOne(mappedBy = "vehiculo")
	private MatriculaVehiculos matriculaVehiculos;

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public MatriculaVehiculos getMatriculaVehiculos() {
		return matriculaVehiculos;
	}

	public void setMatriculaVehiculos(MatriculaVehiculos matriculaVehiculos) {
		this.matriculaVehiculos = matriculaVehiculos;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", placa=" + placa + ", tipo=" + tipo + ", precio=" + precio
				+ "]";
	}

}
