package com.BancoLALR.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table (name = "tarjetas")
public class Tarjeta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idTarjeta;
	
	@Column (name = "Numero_de_Tarjeta")
	@NonNull
	private String numerodeTarjeta;
	
	@Column (name = "IdCuenta")
	@NonNull
	private long idCuenta;
	
	@Column
	@NonNull
	private String icv;
	
	@Column (name = "Tipo")
	@NonNull
	private String tipoTarjeta;

	public long getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getNumerodeTarjeta() {
		return numerodeTarjeta;
	}

	public void setNumerodeTarjeta(String numerodeTarjeta) {
		this.numerodeTarjeta = numerodeTarjeta;
	}

	public long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getIcv() {
		return icv;
	}

	public void setIcv(String icv) {
		this.icv = icv;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

}
