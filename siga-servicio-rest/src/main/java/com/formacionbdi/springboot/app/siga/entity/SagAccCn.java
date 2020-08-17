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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "CACN_CODIGO")
	private String codigo;
	
	@Column(name = "CACN_NOMBRE")
	private String nombre;

	@Column(name = "CACN_TIPENT")
	private String tipent;

	@Column(name = "CACN_ESTADO")
	private String estado;
	
	@Column(name = "CACN_FLGELI")
	private String fgleli;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipent() {
		return tipent;
	}

	public void setTipent(String tipent) {
		this.tipent = tipent;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFgleli() {
		return fgleli;
	}

	public void setFgleli(String fgleli) {
		this.fgleli = fgleli;
	}
	
	
}
