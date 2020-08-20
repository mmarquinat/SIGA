package com.formacionbdi.springboot.app.siga.entity;
import java.io.*;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidad_medida")
public class UnidadM implements Serializable{

	private static final long serialVersionUID = -8760994880076729038L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="UNIDAD_MEDIDA")
	private String unidad_medida;
	@Column(name="CUME_NOMBRE")
	private String cume_nombre;
	@Column(name="CUME_ESTADO")
	private String cume_estado;
	@Column(name="CUME_ABREVIATURA")
	private String cume_abreviatura;
	@Column(name="CUME_ES_PRESUPUESTAL")
	private String cume_es_presupuestal;
	@Column(name="CUME_ES_LOGISTICA")
	private String cume_es_logistica;
	@Column(name="CUME_ES_GOBLOCAL")
	private String cume_es_goblocal;
	@Column(name="CUME_ES_GOBREGIONAL")
	private String cume_es_gobregional;
	@Column(name="CUME_ES_GOBNACIONAL")
	private String cume_es_gobnacional;
	@Column(name="CUME_ES_ETE")
	private String cume_es_ete;
	@Column(name="DUME_FECHA_ALTA")
	private Date dume_fecha_alta;
	@Column(name="DUME_FECHA_ACT")
	private Date dume_fecha_act;
	@Column(name="DUME_FECHA_BAJA")
	private Date dume_fecha_baja;
	@Column(name="NUME_UNIDAD_MEDIDA_SIAF")
	private String nume_unidad_medida_siaf;
	@Column(name="CUME_ES_PATRIMONIO")
	private String cume_es_patrimonio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUnidad_medida() {
		return unidad_medida;
	}
	public void setUnidad_medida(String unidad_medida) {
		this.unidad_medida = unidad_medida;
	}
	public String getCume_nombre() {
		return cume_nombre;
	}
	public void setCume_nombre(String cume_nombre) {
		this.cume_nombre = cume_nombre;
	}
	public String getCume_estado() {
		return cume_estado;
	}
	public void setCume_estado(String cume_estado) {
		this.cume_estado = cume_estado;
	}
	public String getCume_abreviatura() {
		return cume_abreviatura;
	}
	public void setCume_abreviatura(String cume_abreviatura) {
		this.cume_abreviatura = cume_abreviatura;
	}
	public String getCume_es_presupuestal() {
		return cume_es_presupuestal;
	}
	public void setCume_es_presupuestal(String cume_es_presupuestal) {
		this.cume_es_presupuestal = cume_es_presupuestal;
	}
	public String getCume_es_logistica() {
		return cume_es_logistica;
	}
	public void setCume_es_logistica(String cume_es_logistica) {
		this.cume_es_logistica = cume_es_logistica;
	}
	public String getCume_es_goblocal() {
		return cume_es_goblocal;
	}
	public void setCume_es_goblocal(String cume_es_goblocal) {
		this.cume_es_goblocal = cume_es_goblocal;
	}
	public String getCume_es_gobregional() {
		return cume_es_gobregional;
	}
	public void setCume_es_gobregional(String cume_es_gobregional) {
		this.cume_es_gobregional = cume_es_gobregional;
	}
	public String getCume_es_gobnacional() {
		return cume_es_gobnacional;
	}
	public void setCume_es_gobnacional(String cume_es_gobnacional) {
		this.cume_es_gobnacional = cume_es_gobnacional;
	}
	public String getCume_es_ete() {
		return cume_es_ete;
	}
	public void setCume_es_ete(String cume_es_ete) {
		this.cume_es_ete = cume_es_ete;
	}
	public Date getDume_fecha_alta() {
		return dume_fecha_alta;
	}
	public void setDume_fecha_alta(Date dume_fecha_alta) {
		this.dume_fecha_alta = dume_fecha_alta;
	}
	public Date getDume_fecha_act() {
		return dume_fecha_act;
	}
	public void setDume_fecha_act(Date dume_fecha_act) {
		this.dume_fecha_act = dume_fecha_act;
	}
	public Date getDume_fecha_baja() {
		return dume_fecha_baja;
	}
	public void setDume_fecha_baja(Date dume_fecha_baja) {
		this.dume_fecha_baja = dume_fecha_baja;
	}
	public String getNume_unidad_medida_siaf() {
		return nume_unidad_medida_siaf;
	}
	public void setNume_unidad_medida_siaf(String nume_unidad_medida_siaf) {
		this.nume_unidad_medida_siaf = nume_unidad_medida_siaf;
	}
	public String getCume_es_patrimonio() {
		return cume_es_patrimonio;
	}
	public void setCume_es_patrimonio(String cume_es_patrimonio) {
		this.cume_es_patrimonio = cume_es_patrimonio;
	}
	
	
}
