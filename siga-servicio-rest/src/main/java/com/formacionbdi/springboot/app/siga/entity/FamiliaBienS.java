package com.formacionbdi.springboot.app.siga.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "familia_bien_serv")
@IdClass(FamiliaBienSId.class)
public class FamiliaBienS  {
	
	@Id @Column (name = "CFBS_TIPO_BIEN") private String var1;
	@Id @Column (name = "CFBS_GRUPO_BIEN") 	private String var2;
	@Id @Column (name = "CFBS_CLASE_BIEN") 	private String var3;
	@Id @Column (name = "FAMILIA_BIEN") 	private String var4;
	
	@Column (name = "NOMBRE_FAM")
	private String nombre_fam;
	@Column (name = "ALCANCE_FAM")
	private String alcance_fam;
	@Column (name = "NFBS_TIPO_PATRIM")
	private String nfbs_tipo_patrim;
	@Column (name = "NFBS_CLASE_PATRIM")
	private String nfbs_clase_patrim;
	@Column (name = "NFBS_SUBTIPO")
	private String nfbs_subtipo;
	@Column (name = "CFBS_FLAG_ACTIVO")
	private String cfbs_flag_activo;
	@Column (name = "CFBS_TIPO_ACTIVO")
	private String cfbs_tipo_activo;
	@Column (name = "CFBS_FLAG_SBN")
	private String cfbs_flag_sbn;
	@Column (name = "CFBS_FLAG_GFIJO")
	private String cfbs_flag_gfijo;
	@Column (name = "CFBS_ESTADO")
	private String cfbs_estado;
	@Column (name = "DFBS_FECHA_ALTA")
	private Date dfbs_fecha_alta;
	@Column (name = "DFBS_FECHA_ACT")
	private Date dfbs_fecha_act;
	@Column (name = "DFBS_FECHA_BAJA")
	private Date dfbs_fecha_baja;
	@Column (name = "CFBS_CUSER_ID")
	private String cfbs_cuser_id;
	@Column (name = "CFBS_ENVIADO")
	private String cfbs_enviado;
	@Column (name = "CFBS_FLAG_VISUALIZA")
	private String cfbs_flag_visualiza;
	@Column (name = "CFBS_ESTADO_MEF")
	private String cfbs_estado_mef;
	@Column (name = "CFBS_FLAG_DURADERO")
	private String cfbs_flag_duradero;
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
	public String getVar4() {
		return var4;
	}
	public void setVar4(String var4) {
		this.var4 = var4;
	}
	public String getNombre_fam() {
		return nombre_fam;
	}
	public void setNombre_fam(String nombre_fam) {
		this.nombre_fam = nombre_fam;
	}
	public String getAlcance_fam() {
		return alcance_fam;
	}
	public void setAlcance_fam(String alcance_fam) {
		this.alcance_fam = alcance_fam;
	}
	public String getNfbs_tipo_patrim() {
		return nfbs_tipo_patrim;
	}
	public void setNfbs_tipo_patrim(String nfbs_tipo_patrim) {
		this.nfbs_tipo_patrim = nfbs_tipo_patrim;
	}
	public String getNfbs_clase_patrim() {
		return nfbs_clase_patrim;
	}
	public void setNfbs_clase_patrim(String nfbs_clase_patrim) {
		this.nfbs_clase_patrim = nfbs_clase_patrim;
	}
	public String getNfbs_subtipo() {
		return nfbs_subtipo;
	}
	public void setNfbs_subtipo(String nfbs_subtipo) {
		this.nfbs_subtipo = nfbs_subtipo;
	}
	public String getCfbs_flag_activo() {
		return cfbs_flag_activo;
	}
	public void setCfbs_flag_activo(String cfbs_flag_activo) {
		this.cfbs_flag_activo = cfbs_flag_activo;
	}
	public String getCfbs_tipo_activo() {
		return cfbs_tipo_activo;
	}
	public void setCfbs_tipo_activo(String cfbs_tipo_activo) {
		this.cfbs_tipo_activo = cfbs_tipo_activo;
	}
	public String getCfbs_flag_sbn() {
		return cfbs_flag_sbn;
	}
	public void setCfbs_flag_sbn(String cfbs_flag_sbn) {
		this.cfbs_flag_sbn = cfbs_flag_sbn;
	}
	public String getCfbs_flag_gfijo() {
		return cfbs_flag_gfijo;
	}
	public void setCfbs_flag_gfijo(String cfbs_flag_gfijo) {
		this.cfbs_flag_gfijo = cfbs_flag_gfijo;
	}
	public String getCfbs_estado() {
		return cfbs_estado;
	}
	public void setCfbs_estado(String cfbs_estado) {
		this.cfbs_estado = cfbs_estado;
	}
	public Date getDfbs_fecha_alta() {
		return dfbs_fecha_alta;
	}
	public void setDfbs_fecha_alta(Date dfbs_fecha_alta) {
		this.dfbs_fecha_alta = dfbs_fecha_alta;
	}
	public Date getDfbs_fecha_act() {
		return dfbs_fecha_act;
	}
	public void setDfbs_fecha_act(Date dfbs_fecha_act) {
		this.dfbs_fecha_act = dfbs_fecha_act;
	}
	public Date getDfbs_fecha_baja() {
		return dfbs_fecha_baja;
	}
	public void setDfbs_fecha_baja(Date dfbs_fecha_baja) {
		this.dfbs_fecha_baja = dfbs_fecha_baja;
	}
	public String getCfbs_cuser_id() {
		return cfbs_cuser_id;
	}
	public void setCfbs_cuser_id(String cfbs_cuser_id) {
		this.cfbs_cuser_id = cfbs_cuser_id;
	}
	public String getCfbs_enviado() {
		return cfbs_enviado;
	}
	public void setCfbs_enviado(String cfbs_enviado) {
		this.cfbs_enviado = cfbs_enviado;
	}
	public String getCfbs_flag_visualiza() {
		return cfbs_flag_visualiza;
	}
	public void setCfbs_flag_visualiza(String cfbs_flag_visualiza) {
		this.cfbs_flag_visualiza = cfbs_flag_visualiza;
	}
	public String getCfbs_estado_mef() {
		return cfbs_estado_mef;
	}
	public void setCfbs_estado_mef(String cfbs_estado_mef) {
		this.cfbs_estado_mef = cfbs_estado_mef;
	}
	public String getCfbs_flag_duradero() {
		return cfbs_flag_duradero;
	}
	public void setCfbs_flag_duradero(String cfbs_flag_duradero) {
		this.cfbs_flag_duradero = cfbs_flag_duradero;
	}
	
	
	
}
