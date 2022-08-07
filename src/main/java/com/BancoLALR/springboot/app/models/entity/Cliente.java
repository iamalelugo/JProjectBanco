package com.BancoLALR.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@Table (name = "clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idCliente;
	
	@Column (name = "nombre")
	@NotEmpty
	private String nombre;
	
	@Column (name = "apellido")
	@NotEmpty
	private String apellido;
	
	@Column (name = "telefono")
	@NotEmpty
	private String numeroTelefonico;
	
	@Column (name = "correo")
	@NotEmpty
	private String correo;

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
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

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
