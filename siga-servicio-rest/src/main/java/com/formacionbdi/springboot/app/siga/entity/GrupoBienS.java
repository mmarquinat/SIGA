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
@Table(name = "grupo_bien_serv")
public class GrupoBienS implements Serializable {

	private static final long serialVersionUID = -869429871154743351L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="TIPO_BIEN")
	private String BS_tipobien;
	@Column(name="GRUPO_BIEN")
	private String BS_grupobien;
	@Column(name="NOMBRE_GRUPO")
	private String BS_gruponombre;
	@Column(name="ALCANCE_GRUPO")
	private String BS_grupoalcance;
	@Column(name="FLAG_ACTIVO")
	private String BS_flag;
	@Column(name="FLAG_SBN")
	private String BS_flagSBN;
	@Column(name="ESTADO")
	private String BS_estado;
	@Column(name="FECHA_ALTA")
	private Date BS_fechaalta;
	@Column(name="FECHA_ACT")
	private Date BS_fechaact;
	@Column(name="FECHA_BAJA")
	private Date BS_fechabaja;
	@Column(name="CUSER_ID")
	private String BS_userid;
	@Column(name="ENVIADO")
	private String BS_enviado;
	@Column(name="FLAG_VISUALIZA")
	private String BS_flagvisua;
	@Column(name="FLAG_EXCEPCION")
	private String BS_flagexcep;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBS_tipobien() {
		return BS_tipobien;
	}
	public void setBS_tipobien(String bS_tipobien) {
		BS_tipobien = bS_tipobien;
	}
	public String getBS_grupobien() {
		return BS_grupobien;
	}
	public void setBS_grupobien(String bS_grupobien) {
		BS_grupobien = bS_grupobien;
	}
	public String getBS_gruponombre() {
		return BS_gruponombre;
	}
	public void setBS_gruponombre(String bS_gruponombre) {
		BS_gruponombre = bS_gruponombre;
	}
	public String getBS_grupoalcance() {
		return BS_grupoalcance;
	}
	public void setBS_grupoalcance(String bS_grupoalcance) {
		BS_grupoalcance = bS_grupoalcance;
	}
	public String getBS_flag() {
		return BS_flag;
	}
	public void setBS_flag(String bS_flag) {
		BS_flag = bS_flag;
	}
	public String getBS_flagSBN() {
		return BS_flagSBN;
	}
	public void setBS_flagSBN(String bS_flagSBN) {
		BS_flagSBN = bS_flagSBN;
	}
	public String getBS_estado() {
		return BS_estado;
	}
	public void setBS_estado(String bS_estado) {
		BS_estado = bS_estado;
	}
	public Date getBS_fechaalta() {
		return BS_fechaalta;
	}
	public void setBS_fechaalta(Date bS_fechaalta) {
		BS_fechaalta = bS_fechaalta;
	}
	public Date getBS_fechaact() {
		return BS_fechaact;
	}
	public void setBS_fechaact(Date bS_fechaact) {
		BS_fechaact = bS_fechaact;
	}
	public Date getBS_fechabaja() {
		return BS_fechabaja;
	}
	public void setBS_fechabaja(Date bS_fechabaja) {
		BS_fechabaja = bS_fechabaja;
	}
	public String getBS_userid() {
		return BS_userid;
	}
	public void setBS_userid(String bS_userid) {
		BS_userid = bS_userid;
	}
	public String getBS_enviado() {
		return BS_enviado;
	}
	public void setBS_enviado(String bS_enviado) {
		BS_enviado = bS_enviado;
	}
	public String getBS_flagvisua() {
		return BS_flagvisua;
	}
	public void setBS_flagvisua(String bS_flagvisua) {
		BS_flagvisua = bS_flagvisua;
	}
	public String getBS_flagexcep() {
		return BS_flagexcep;
	}
	public void setBS_flagexcep(String bS_flagexcep) {
		BS_flagexcep = bS_flagexcep;
	}

}
