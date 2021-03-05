package com.pruebaTecnica.model.entity;



import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_usuario")
	private int idUsuario;
	
	private int cedula;
	
	private int direccion;
	
	private String nombre;
	
	private String apellido;

	public int getId_usuario() {
		return idUsuario;
	}

	public void setId_usuario(int id_usuario) {
		this.idUsuario = id_usuario;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
