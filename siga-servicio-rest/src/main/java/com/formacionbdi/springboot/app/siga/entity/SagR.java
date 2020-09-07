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
@Table(name = "sag_rrhh")
public class SagR implements Serializable{
		
	private static final long serialVersionUID = 2674679338584223525L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CORD_CODIGO")
	private String COcodigo;
	@Column(name = "CPER_CODIGO")
	private String CPcodigo;
	@Column(name = "DRHU_INIPRO")
	private Date DRinipro;
	@Column(name = "DRHU_FINPRO")
	private Date DRfinpro;
	@Column(name = "DRHU_INIREA")
	private Date DRinirea;
	@Column(name = "DRHU_FINREA")
	private Date DRfinrea;
	@Column(name = "CRHU_ESTADO")
	private String CRestado;
	@Column(name = "CRHU_FLGELI")
	private String CRfgleli;
	@Column(name = "CRHU_USUCRE")
	private String CRusucre;
	@Column(name = "DRHU_FECCRE")
	private Date DRfeccre;
	@Column(name = "CRHU_USUMOD")
	private String CRusumod;
	@Column(name = "DRHU_FECMOD")
	private Date DRfecmod;
	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	public String getCOcodigo() {
		return COcodigo;
	}
	public void setCOcodigo(String cOcodigo) {
		COcodigo = cOcodigo;
	}
	public String getCPcodigo() {
		return CPcodigo;
	}
	public void setCPcodigo(String cPcodigo) {
		CPcodigo = cPcodigo;
	}
	public Date getDRinipro() {
		return DRinipro;
	}
	public void setDRinipro(Date dRinipro) {
		DRinipro = dRinipro;
	}
	public Date getDRfinpro() {
		return DRfinpro;
	}
	public void setDRfinpro(Date dRfinpro) {
		DRfinpro = dRfinpro;
	}
	public Date getDRinirea() {
		return DRinirea;
	}
	public void setDRinirea(Date dRinirea) {
		DRinirea = dRinirea;
	}
	public Date getDRfinrea() {
		return DRfinrea;
	}
	public void setDRfinrea(Date dRfinrea) {
		DRfinrea = dRfinrea;
	}
	public String getCRestado() {
		return CRestado;
	}
	public void setCRestado(String cRestado) {
		CRestado = cRestado;
	}
	public String getCRfgleli() {
		return CRfgleli;
	}
	public void setCRfgleli(String cRfgleli) {
		CRfgleli = cRfgleli;
	}
	public String getCRusucre() {
		return CRusucre;
	}
	public void setCRusucre(String cRusucre) {
		CRusucre = cRusucre;
	}
	public Date getDRfeccre() {
		return DRfeccre;
	}
	public void setDRfeccre(Date dRfeccre) {
		DRfeccre = dRfeccre;
	}
	public String getCRusumod() {
		return CRusumod;
	}
	public void setCRusumod(String cRusumod) {
		CRusumod = cRusumod;
	}
	public Date getDRfecmod() {
		return DRfecmod;
	}
	public void setDRfecmod(Date dRfecmod) {
		DRfecmod = dRfecmod;
	}
	
	
}
