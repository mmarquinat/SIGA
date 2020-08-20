package com.formacionbdi.springboot.app.siga.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sag_ordenes")
public class SagO implements Serializable{
	

	private static final long serialVersionUID = -7473099020564589939L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CORD_CODIGO")
	private String COcodigo;
	@Column(name = "CACN_CODIGO")
	private String CNcodigo;
	@Column(name = "CACM_CODIGO")
	private String CMcodigo;
	@Column(name = "CORD_ESTADO")
	private String COestado;
	@Column(name = "CORD_FLGELI")
	private String COfgleli;
	@Column(name = "CORD_USUCRE")
	private String COusucre;
	@Column(name = "DORD_FECCRE")
	private Date DOfeccre;
	@Column(name = "CORD_USUMOD")
	private String COusumod;
	@Column(name = "DORD_FECMOD")
	private Date DOfecmod;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCOcodigo() {
		return COcodigo;
	}
	public void setCOcodigo(String cOcodigo) {
		COcodigo = cOcodigo;
	}
	public String getCNcodigo() {
		return CNcodigo;
	}
	public void setCNcodigo(String cNcodigo) {
		CNcodigo = cNcodigo;
	}
	public String getCMcodigo() {
		return CMcodigo;
	}
	public void setCMcodigo(String cMcodigo) {
		CMcodigo = cMcodigo;
	}
	public String getCOestado() {
		return COestado;
	}
	public void setCOestado(String cOestado) {
		COestado = cOestado;
	}
	public String getCOfgleli() {
		return COfgleli;
	}
	public void setCOfgleli(String cOfgleli) {
		COfgleli = cOfgleli;
	}
	public String getCOusucre() {
		return COusucre;
	}
	public void setCOusucre(String cOusucre) {
		COusucre = cOusucre;
	}
	public Date getDOfeccre() {
		return DOfeccre;
	}
	public void setDOfeccre(Date dOfeccre) {
		DOfeccre = dOfeccre;
	}
	public String getCOusumod() {
		return COusumod;
	}
	public void setCOusumod(String cOusumod) {
		COusumod = cOusumod;
	}
	public Date getDOfecmod() {
		return DOfecmod;
	}
	public void setDOfecmod(Date dOfecmod) {
		DOfecmod = dOfecmod;
	}
	
	
}
