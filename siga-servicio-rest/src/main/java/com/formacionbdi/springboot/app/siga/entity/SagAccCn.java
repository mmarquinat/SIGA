package com.formacionbdi.springboot.app.siga.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sag_acc_con")
public class SagAccCn implements Serializable{
	
	private static final long serialVersionUID = 5973174676128997761L;
	
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "CACN_CODIGO")
	private String CNcodigo;
	@Column(name = "CACN_NOMBRE")
	private String CNnombre;
	@Column(name = "CACN_TIPENT")
	private String CNtipent;
	@Column(name = "CACN_ESTADO")
	private String CNestado;
	@Column(name = "CACN_FLGELI")
	private String CNfgleli;
	
	public String getCNcodigo() {
		return CNcodigo;
	}

	public void setCNcodigo(String codigo) {
		this.CNcodigo = codigo;
	}

	public String getNombre() {
		return CNnombre;
	}

	public void setNombre(String nombre) {
		this.CNnombre = nombre;
	}

	public String getTipent() {
		return CNtipent;
	}

	public void setTipent(String tipent) {
		this.CNtipent = tipent;
	}

	public String getEstado() {
		return CNestado;
	}

	public void setEstado(String estado) {
		this.CNestado = estado;
	}

	public String getFgleli() {
		return CNfgleli;
	}

	public void setFgleli(String fgleli) {
		this.CNfgleli = fgleli;
	}
	
	
}
