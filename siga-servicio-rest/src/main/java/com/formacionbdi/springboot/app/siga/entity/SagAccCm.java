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
	private String codigo;
	@Column(name = "CACM_DESCRI")
	private String descri;
	@Column(name = "CACM_TIPENT")
	private String tipent;
	@Column(name = "CACM_ESTADO")
	private String estado;
	@Column(name = "CACM_FLGELI")
	private String fgleli;
	@Column(name = "DACM_FECCRE")
	private Date feccre;
	@Column(name = "CACM_USUCRE")
	private String usucre;
	@Column(name = "DACM_FECMOD")
	private Date fecmod;
	@Column(name = "CACM_USUMOD")
	private String usumod;
	
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
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
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
	public Date getFeccre() {
		return feccre;
	}
	public void setFeccre(Date feccre) {
		this.feccre = feccre;
	}
	public String getUsucre() {
		return usucre;
	}
	public void setUsucre(String usucre) {
		this.usucre = usucre;
	}
	public Date getFecmod() {
		return fecmod;
	}
	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}
	public String getUsumod() {
		return usumod;
	}
	public void setUsumod(String usumod) {
		this.usumod = usumod;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
