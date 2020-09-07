package com.formacionbdi.springboot.app.siga.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "clase_bien_serv")
public class ClaseBienS implements Serializable{

	private static final long serialVersionUID = 8742039005752763207L;
	
	@Id @Column(name = "CCBS_TIPO_BIEN") private String var1;
	@Column(name = "CCBS_GRUPO_BIEN") private String var2;
	@Column(name = "CCBS_CLASE_BIEN") private String var3;
	
	@Column(name = "NOMBRE_CLASE")
	private String nombre_clase;
	@Column(name = "ALCANCE_CLASE")
	private String alcance_clase;
	@Column(name = "TIPO_PATRIM")
	private String tipo_patrim;
	@Column(name = "CLASE_PATRIM")
	private String clase_patrim;
	@Column(name = "SUBTIPO")
	private String subtipo;
	@Column(name = "CCBS_FLAG_ACTIVO")
	private String ccbs_flag_activo;
	@Column(name = "CCBS_FLAG_SBN")
	private String ccbs_flag_sbn;
	@Column(name = "CCBS_ESTADO")
	private String ccbs_estado;
	@Column(name = "DCBS_FECHA_ALTA")
	private Date dcbs_fecha_alta;
	@Column(name = "DCBS_FECHA_ACT")
	private Date dcbs_fecha_act;
	@Column(name = "DCBS_FECHA_BAJA")
	private Date dcbs_fecha_baja;
	@Column(name = "CCBS_CUSER_ID")
	private String ccbs_cuser_id;
	@Column(name = "CCBS_ENVIADO")
	private String ccbs_enviado;
	@Column(name = "CCBS_FLAG_VISUALIZA")
	private String ccbs_flag_visualiza;
	
	
	public String getVar1() {
		return var1;
	}
	public void setVar1(String var1) {
		this.var1 = var1;
	}
	public String getVar2() {
		return var2;
	}
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	public String getVar3() {
		return var3;
	}
	public void setVar3(String var3) {
		this.var3 = var3;
	}
	public String getNombre_clase() {
		return nombre_clase;
	}
	public void setNombre_clase(String nombre_clase) {
		this.nombre_clase = nombre_clase;
	}
	public String getAlcance_clase() {
		return alcance_clase;
	}
	public void setAlcance_clase(String alcance_clase) {
		this.alcance_clase = alcance_clase;
	}
	public String getTipo_patrim() {
		return tipo_patrim;
	}
	public void setTipo_patrim(String tipo_patrim) {
		this.tipo_patrim = tipo_patrim;
	}
	public String getClase_patrim() {
		return clase_patrim;
	}
	public void setClase_patrim(String clase_patrim) {
		this.clase_patrim = clase_patrim;
	}
	public String getSubtipo() {
		return subtipo;
	}
	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}
	public String getCcbs_flag_activo() {
		return ccbs_flag_activo;
	}
	public void setCcbs_flag_activo(String ccbs_flag_activo) {
		this.ccbs_flag_activo = ccbs_flag_activo;
	}
	public String getCcbs_flag_sbn() {
		return ccbs_flag_sbn;
	}
	public void setCcbs_flag_sbn(String ccbs_flag_sbn) {
		this.ccbs_flag_sbn = ccbs_flag_sbn;
	}
	public String getCcbs_estado() {
		return ccbs_estado;
	}
	public void setCcbs_estado(String ccbs_estado) {
		this.ccbs_estado = ccbs_estado;
	}
	public Date getDcbs_fecha_alta() {
		return dcbs_fecha_alta;
	}
	public void setDcbs_fecha_alta(Date dcbs_fecha_alta) {
		this.dcbs_fecha_alta = dcbs_fecha_alta;
	}
	public Date getDcbs_fecha_act() {
		return dcbs_fecha_act;
	}
	public void setDcbs_fecha_act(Date dcbs_fecha_act) {
		this.dcbs_fecha_act = dcbs_fecha_act;
	}
	public Date getDcbs_fecha_baja() {
		return dcbs_fecha_baja;
	}
	public void setDcbs_fecha_baja(Date dcbs_fecha_baja) {
		this.dcbs_fecha_baja = dcbs_fecha_baja;
	}
	public String getCcbs_cuser_id() {
		return ccbs_cuser_id;
	}
	public void setCcbs_cuser_id(String ccbs_cuser_id) {
		this.ccbs_cuser_id = ccbs_cuser_id;
	}
	public String getCcbs_enviado() {
		return ccbs_enviado;
	}
	public void setCcbs_enviado(String ccbs_enviado) {
		this.ccbs_enviado = ccbs_enviado;
	}
	public String getCcbs_flag_visualiza() {
		return ccbs_flag_visualiza;
	}
	public void setCcbs_flag_visualiza(String ccbs_flag_visualiza) {
		this.ccbs_flag_visualiza = ccbs_flag_visualiza;
	}
	
}