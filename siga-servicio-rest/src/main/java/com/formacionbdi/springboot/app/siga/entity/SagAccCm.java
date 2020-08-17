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
@Table(name = "sag_acc_com")
public class SagAccCm implements Serializable{
	
	private static final long serialVersionUID = -1606894697532819698L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CACM_CODIGO")
	private String CMcodigo;
	@Column(name = "CACM_DESCRI")
	private String CMdescri;
	@Column(name = "CACM_TIPENT")
	private String CMtipent;
	@Column(name = "CACM_ESTADO")
	private String CMestado;
	@Column(name = "CACM_FLGELI")
	private String CMfgleli;
	@Column(name = "DACM_FECCRE")
	private Date CMfeccre;
	@Column(name = "CACM_USUCRE")
	private String CMusucre;
	@Column(name = "DACM_FECMOD")
	private Date CMfecmod;
	@Column(name = "CACM_USUMOD")
	private String CMusumod;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCACMcodigo() {
		return CMcodigo;
	}
	public void setCACMcodigo(String codigo) {
		this.CMcodigo = codigo;
	}
	public String getDescri() {
		return CMdescri;
	}
	public void setDescri(String descri) {
		this.CMdescri = descri;
	}
	public String getTipent() {
		return CMtipent;
	}
	public void setTipent(String tipent) {
		this.CMtipent = tipent;
	}
	public String getEstado() {
		return CMestado;
	}
	public void setEstado(String estado) {
		this.CMestado = estado;
	}
	public String getFgleli() {
		return CMfgleli;
	}
	public void setFgleli(String fgleli) {
		this.CMfgleli = fgleli;
	}
	public Date getFeccre() {
		return CMfeccre;
	}
	public void setFeccre(Date feccre) {
		this.CMfeccre = feccre;
	}
	public String getUsucre() {
		return CMusucre;
	}
	public void setUsucre(String usucre) {
		this.CMusucre = usucre;
	}
	public Date getFecmod() {
		return CMfecmod;
	}
	public void setFecmod(Date fecmod) {
		this.CMfecmod = fecmod;
	}
	public String getUsumod() {
		return CMusumod;
	}
	public void setUsumod(String usumod) {
		this.CMusumod = usumod;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	 
}
