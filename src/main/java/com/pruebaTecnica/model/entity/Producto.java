package com.pruebaTecnica.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="nombre_producto")
	private String nombreProducto;
	
	@Column(name="valor_producto")
	private int valorProducto;

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getValorProducto() {
		return valorProducto;
	}

	public void setValorProducto(int valorProducto) {
		this.valorProducto = valorProducto;
	}
	
	
}
