package com.uce.edu.demo.repository.modelo.prueba;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@Entity
//@Table(name = "matricula_vehiculos")
public class MatriculaVehiculos {
	
//	@Id
//	@Column(name = "mave_id")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
//	@SequenceGenerator(name = "name_generator",sequenceName = "mave_id_seq", allocationSize = 1)
	private Integer id;
//	@Column(name = "mave_fecha_matricula", columnDefinition = "TIMESTAMP")
	private LocalDateTime fechaMatricula;
//	@Column(name = "mave_valor_matricula")
	private BigDecimal valorMatricula;
	private Propietario propietario;
	private Vehiculo vehiculo;
	
	//set y get
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "MatriculaVehiculos [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula
				+ ", propietario=" + propietario + ", vehiculo=" + vehiculo + "]";
	}
	
	

}
