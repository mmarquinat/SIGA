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
@Table(name = "catalogo_bien_serv")
public class CatalogoBienS implements Serializable{
	
	private static final long serialVersionUID = 8830465643714731763L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NCAT_SEC_EJEC")
	private String ncat_sec_ejec;
	@Column(name = "CCAT_TIPO_BIEN")
	private String ccat_tipo_bien;
	@Column(name = "CCAT_GRUPO_BIEN")
	private String ccat_grupo_bien;
	@Column(name = "CCAT_CLASE_BIEN")
	private String ccat_clase_bien;
	@Column(name = "CCAT_FAMILIA_BIEN")
	private String ccat_familia_bien;
	@Column(name = "ITEM_BIEN")
	private String item_bien;
	@Column(name = "NOMBRE_ITEM")
	private String nombre_item;
	@Column(name = "CCAT_FLAG_ACTIVO")
	private String ccat_flag_activo;
	@Column(name = "CCAT_TIPO_ACTIVO")
	private String ccat_tipo_activo;
	@Column(name = "NCAT_UNIDAD_ADQUIS")
	private String ncat_unidad_adquis;
	@Column(name = "NCAT_FACTOR_UNIDAD")
	private String ncat_factor_unidad;
	@Column(name = "UNIDAD_MEDIDA")
	private String unidad_medida;
	@Column(name = "CCAT_PRESENTACION")
	private String ccat_presentacion;
	@Column(name = "CCAT_COND_ALMAC")
	private String ccat_cond_almac;
	@Column(name = "NCAT_MARCA_REF")
	private String ncat_marca_ref;
	@Column(name = "NCAT_PRECIO_REF")
	private String ncat_precio_ref;
	@Column(name = "DCAT_FECHA_REF")
	private Date dcat_fecha_ref;
	@Column(name = "NCAT_PRECIO_COMPRA")
	private String ncat_precio_compra;
	@Column(name = "DCAT_FECHA_COMPRA")
	private Date dcat_fecha_compra;
	@Column(name = "CCAT_ITEM_CRITICO")
	private String ccat_item_critico;
	@Column(name = "CCAT_FLAG_ITEM")
	private String ccat_flag_item;
	@Column(name = "NCAT_PRECIO_DOLAR")
	private String ncat_precio_dolar;
	@Column(name = "NCAT_STOCK_MINIMO")
	private String ncat_stock_minimo;
	@Column(name = "NCAT_STOCK_MAXIMO")
	private String ncat_stock_maximo;
	@Column(name = "CCAT_ESTADO")
	private String ccat_estado;
	@Column(name = "DCAT_FECHA_ALTA")
	private Date dcat_fecha_alta;
	@Column(name = "DCAT_FECHA_ACT")
	private Date dcat_fecha_act;
	@Column(name = "DCAT_BOLSA_PRODUCTO")
	private String dcat_bolsa_producto;
	@Column(name = "CCAT_CUSER_ID")
	private String ccat_cuser_id;
	@Column(name = "CCAT_PAIS")
	private String ccat_pais;
	@Column(name = "CCAT_FLAG_VISUALIZA")
	private String ccat_flag_visualiza;
	@Column(name = "CCAT_ENVIADO")
	private String ccat_enviado;
	@Column(name = "CCAT_FLAG_UNIDADES")
	private String ccat_flag_unidades;
	@Column(name = "CCAT_CODIGO_ITEM")
	private String ccat_codigo_item;
	@Column(name = "CCAT_TIPO_MARCA")
	private String ccat_tipo_marca;
	@Column(name = "CCAT_FLAG_SUBASTA_INVERSA")
	private String ccat_flag_subasta_inversa;
	@Column(name = "CCAT_FLAG_MARCO_PRECIO")
	private String ccat_flag_marco_precio;
	@Column(name = "CCAT_FLAG_ESTADO")
	private String ccat_flag_estado;
	@Column(name = "CCAT_GRUPO_BIEN_PADRE")
	private String ccat_grupo_bien_padre;
	@Column(name = "CCAT_CLASE_BIEN_PADRE")
	private String ccat_clase_bien_padre;
	@Column(name = "CCAT_FAMILIA_BIEN_PADRE")
	private String ccat_familia_bien_padre;
	@Column(name = "CCAT_ITEM_BIEN_PADRE")
	private String ccat_item_bien_padre;
	@Column(name = "NCAT_CLASE_BIEN_DET")
	private String ncat_clase_bien_det;
	@Column(name = "CCAT_CODIGO_ONU")
	private String ccat_codigo_onu;
	@Column(name = "CCAT_FLAG_PLAN_LOGISTICO")
	private String ccat_flag_plan_logistico;
	@Column(name = "CCAT_FLAG_PLAN_72_HORAS")
	private String ccat_flag_plan_72_horas;
	@Column(name = "NCAT_PESO")
	private String ncat_peso;
	@Column(name = "NCAT_VOLUMEN")
	private String ncat_volumen;
	@Column(name = "CCAT_ESTADO_MEF")
	private String ccat_estado_mef;
	@Column(name = "CCAT_NRO_STOCK_OTAN")
	private String ccat_nro_stock_otan;
	@Column(name = "CCAT_CODIGO_OSCE")
	private String ccat_codigo_osce;
	@Column(name = "CCAT_FLAG_MEJORA")
	private String ccat_flag_mejora;
	@Column(name = "CCAT_FLAG_AGRUPADO")
	private String ccat_flag_agrupado;
	@Column(name = "CCAT_IND_COMPONENTE")
	private String ccat_ind_componente;
	@Column(name = "CCAT_IND_UNIDAD_ACTIVO")
	private String ccat_ind_unidad_activo;
	@Column(name = "CCAT_FLAG_DURADERO")
	private String ccat_flag_duradero;
	@Column(name = "CCAT_ALIAS1")
	private String ccat_alias1;
	@Column(name = "CCAT_ALIAS2")
	private String ccat_alias2;
	@Column(name = "CCAT_ALIAS3")
	private String ccat_alias3;
	@Column(name = "CCAT_TIPO_UNIDAD")
	private String ccat_tipo_unidad;
	@Column(name = "NCAT_ANO_ORDEN")
	private String ncat_ano_orden;
	@Column(name = "NCAT_NRO_ORDEN")
	private String ncat_nro_orden;
	@Column(name = "NCAT_TIPO_PPTO")
	private String ncat_tipo_ppto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNcat_sec_ejec() {
		return ncat_sec_ejec;
	}
	public void setNcat_sec_ejec(String ncat_sec_ejec) {
		this.ncat_sec_ejec = ncat_sec_ejec;
	}
	public String getCcat_tipo_bien() {
		return ccat_tipo_bien;
	}
	public void setCcat_tipo_bien(String ccat_tipo_bien) {
		this.ccat_tipo_bien = ccat_tipo_bien;
	}
	public String getCcat_grupo_bien() {
		return ccat_grupo_bien;
	}
	public void setCcat_grupo_bien(String ccat_grupo_bien) {
		this.ccat_grupo_bien = ccat_grupo_bien;
	}
	public String getCcat_clase_bien() {
		return ccat_clase_bien;
	}
	public void setCcat_clase_bien(String ccat_clase_bien) {
		this.ccat_clase_bien = ccat_clase_bien;
	}
	public String getCcat_familia_bien() {
		return ccat_familia_bien;
	}
	public void setCcat_familia_bien(String ccat_familia_bien) {
		this.ccat_familia_bien = ccat_familia_bien;
	}
	public String getItem_bien() {
		return item_bien;
	}
	public void setItem_bien(String item_bien) {
		this.item_bien = item_bien;
	}
	public String getNombre_item() {
		return nombre_item;
	}
	public void setNombre_item(String nombre_item) {
		this.nombre_item = nombre_item;
	}
	public String getCcat_flag_activo() {
		return ccat_flag_activo;
	}
	public void setCcat_flag_activo(String ccat_flag_activo) {
		this.ccat_flag_activo = ccat_flag_activo;
	}
	public String getCcat_tipo_activo() {
		return ccat_tipo_activo;
	}
	public void setCcat_tipo_activo(String ccat_tipo_activo) {
		this.ccat_tipo_activo = ccat_tipo_activo;
	}
	public String getNcat_unidad_adquis() {
		return ncat_unidad_adquis;
	}
	public void setNcat_unidad_adquis(String ncat_unidad_adquis) {
		this.ncat_unidad_adquis = ncat_unidad_adquis;
	}
	public String getNcat_factor_unidad() {
		return ncat_factor_unidad;
	}
	public void setNcat_factor_unidad(String ncat_factor_unidad) {
		this.ncat_factor_unidad = ncat_factor_unidad;
	}
	public String getUnidad_medida() {
		return unidad_medida;
	}
	public void setUnidad_medida(String unidad_medida) {
		this.unidad_medida = unidad_medida;
	}
	public String getCcat_presentacion() {
		return ccat_presentacion;
	}
	public void setCcat_presentacion(String ccat_presentacion) {
		this.ccat_presentacion = ccat_presentacion;
	}
	public String getCcat_cond_almac() {
		return ccat_cond_almac;
	}
	public void setCcat_cond_almac(String ccat_cond_almac) {
		this.ccat_cond_almac = ccat_cond_almac;
	}
	public String getNcat_marca_ref() {
		return ncat_marca_ref;
	}
	public void setNcat_marca_ref(String ncat_marca_ref) {
		this.ncat_marca_ref = ncat_marca_ref;
	}
	public String getNcat_precio_ref() {
		return ncat_precio_ref;
	}
	public void setNcat_precio_ref(String ncat_precio_ref) {
		this.ncat_precio_ref = ncat_precio_ref;
	}
	public Date getDcat_fecha_ref() {
		return dcat_fecha_ref;
	}
	public void setDcat_fecha_ref(Date dcat_fecha_ref) {
		this.dcat_fecha_ref = dcat_fecha_ref;
	}
	public String getNcat_precio_compra() {
		return ncat_precio_compra;
	}
	public void setNcat_precio_compra(String ncat_precio_compra) {
		this.ncat_precio_compra = ncat_precio_compra;
	}
	public Date getDcat_fecha_compra() {
		return dcat_fecha_compra;
	}
	public void setDcat_fecha_compra(Date dcat_fecha_compra) {
		this.dcat_fecha_compra = dcat_fecha_compra;
	}
	public String getCcat_item_critico() {
		return ccat_item_critico;
	}
	public void setCcat_item_critico(String ccat_item_critico) {
		this.ccat_item_critico = ccat_item_critico;
	}
	public String getCcat_flag_item() {
		return ccat_flag_item;
	}
	public void setCcat_flag_item(String ccat_flag_item) {
		this.ccat_flag_item = ccat_flag_item;
	}
	public String getNcat_precio_dolar() {
		return ncat_precio_dolar;
	}
	public void setNcat_precio_dolar(String ncat_precio_dolar) {
		this.ncat_precio_dolar = ncat_precio_dolar;
	}
	public String getNcat_stock_minimo() {
		return ncat_stock_minimo;
	}
	public void setNcat_stock_minimo(String ncat_stock_minimo) {
		this.ncat_stock_minimo = ncat_stock_minimo;
	}
	public String getNcat_stock_maximo() {
		return ncat_stock_maximo;
	}
	public void setNcat_stock_maximo(String ncat_stock_maximo) {
		this.ncat_stock_maximo = ncat_stock_maximo;
	}
	public String getCcat_estado() {
		return ccat_estado;
	}
	public void setCcat_estado(String ccat_estado) {
		this.ccat_estado = ccat_estado;
	}
	public Date getDcat_fecha_alta() {
		return dcat_fecha_alta;
	}
	public void setDcat_fecha_alta(Date dcat_fecha_alta) {
		this.dcat_fecha_alta = dcat_fecha_alta;
	}
	public Date getDcat_fecha_act() {
		return dcat_fecha_act;
	}
	public void setDcat_fecha_act(Date dcat_fecha_act) {
		this.dcat_fecha_act = dcat_fecha_act;
	}
	public String getDcat_bolsa_producto() {
		return dcat_bolsa_producto;
	}
	public void setDcat_bolsa_producto(String dcat_bolsa_producto) {
		this.dcat_bolsa_producto = dcat_bolsa_producto;
	}
	public String getCcat_cuser_id() {
		return ccat_cuser_id;
	}
	public void setCcat_cuser_id(String ccat_cuser_id) {
		this.ccat_cuser_id = ccat_cuser_id;
	}
	public String getCcat_pais() {
		return ccat_pais;
	}
	public void setCcat_pais(String ccat_pais) {
		this.ccat_pais = ccat_pais;
	}
	public String getCcat_flag_visualiza() {
		return ccat_flag_visualiza;
	}
	public void setCcat_flag_visualiza(String ccat_flag_visualiza) {
		this.ccat_flag_visualiza = ccat_flag_visualiza;
	}
	public String getCcat_enviado() {
		return ccat_enviado;
	}
	public void setCcat_enviado(String ccat_enviado) {
		this.ccat_enviado = ccat_enviado;
	}
	public String getCcat_flag_unidades() {
		return ccat_flag_unidades;
	}
	public void setCcat_flag_unidades(String ccat_flag_unidades) {
		this.ccat_flag_unidades = ccat_flag_unidades;
	}
	public String getCcat_codigo_item() {
		return ccat_codigo_item;
	}
	public void setCcat_codigo_item(String ccat_codigo_item) {
		this.ccat_codigo_item = ccat_codigo_item;
	}
	public String getCcat_tipo_marca() {
		return ccat_tipo_marca;
	}
	public void setCcat_tipo_marca(String ccat_tipo_marca) {
		this.ccat_tipo_marca = ccat_tipo_marca;
	}
	public String getCcat_flag_subasta_inversa() {
		return ccat_flag_subasta_inversa;
	}
	public void setCcat_flag_subasta_inversa(String ccat_flag_subasta_inversa) {
		this.ccat_flag_subasta_inversa = ccat_flag_subasta_inversa;
	}
	public String getCcat_flag_marco_precio() {
		return ccat_flag_marco_precio;
	}
	public void setCcat_flag_marco_precio(String ccat_flag_marco_precio) {
		this.ccat_flag_marco_precio = ccat_flag_marco_precio;
	}
	public String getCcat_flag_estado() {
		return ccat_flag_estado;
	}
	public void setCcat_flag_estado(String ccat_flag_estado) {
		this.ccat_flag_estado = ccat_flag_estado;
	}
	public String getCcat_grupo_bien_padre() {
		return ccat_grupo_bien_padre;
	}
	public void setCcat_grupo_bien_padre(String ccat_grupo_bien_padre) {
		this.ccat_grupo_bien_padre = ccat_grupo_bien_padre;
	}
	public String getCcat_clase_bien_padre() {
		return ccat_clase_bien_padre;
	}
	public void setCcat_clase_bien_padre(String ccat_clase_bien_padre) {
		this.ccat_clase_bien_padre = ccat_clase_bien_padre;
	}
	public String getCcat_familia_bien_padre() {
		return ccat_familia_bien_padre;
	}
	public void setCcat_familia_bien_padre(String ccat_familia_bien_padre) {
		this.ccat_familia_bien_padre = ccat_familia_bien_padre;
	}
	public String getCcat_item_bien_padre() {
		return ccat_item_bien_padre;
	}
	public void setCcat_item_bien_padre(String ccat_item_bien_padre) {
		this.ccat_item_bien_padre = ccat_item_bien_padre;
	}
	public String getNcat_clase_bien_det() {
		return ncat_clase_bien_det;
	}
	public void setNcat_clase_bien_det(String ncat_clase_bien_det) {
		this.ncat_clase_bien_det = ncat_clase_bien_det;
	}
	public String getCcat_codigo_onu() {
		return ccat_codigo_onu;
	}
	public void setCcat_codigo_onu(String ccat_codigo_onu) {
		this.ccat_codigo_onu = ccat_codigo_onu;
	}
	public String getCcat_flag_plan_logistico() {
		return ccat_flag_plan_logistico;
	}
	public void setCcat_flag_plan_logistico(String ccat_flag_plan_logistico) {
		this.ccat_flag_plan_logistico = ccat_flag_plan_logistico;
	}
	public String getCcat_flag_plan_72_horas() {
		return ccat_flag_plan_72_horas;
	}
	public void setCcat_flag_plan_72_horas(String ccat_flag_plan_72_horas) {
		this.ccat_flag_plan_72_horas = ccat_flag_plan_72_horas;
	}
	public String getNcat_peso() {
		return ncat_peso;
	}
	public void setNcat_peso(String ncat_peso) {
		this.ncat_peso = ncat_peso;
	}
	public String getNcat_volumen() {
		return ncat_volumen;
	}
	public void setNcat_volumen(String ncat_volumen) {
		this.ncat_volumen = ncat_volumen;
	}
	public String getCcat_estado_mef() {
		return ccat_estado_mef;
	}
	public void setCcat_estado_mef(String ccat_estado_mef) {
		this.ccat_estado_mef = ccat_estado_mef;
	}
	public String getCcat_nro_stock_otan() {
		return ccat_nro_stock_otan;
	}
	public void setCcat_nro_stock_otan(String ccat_nro_stock_otan) {
		this.ccat_nro_stock_otan = ccat_nro_stock_otan;
	}
	public String getCcat_codigo_osce() {
		return ccat_codigo_osce;
	}
	public void setCcat_codigo_osce(String ccat_codigo_osce) {
		this.ccat_codigo_osce = ccat_codigo_osce;
	}
	public String getCcat_flag_mejora() {
		return ccat_flag_mejora;
	}
	public void setCcat_flag_mejora(String ccat_flag_mejora) {
		this.ccat_flag_mejora = ccat_flag_mejora;
	}
	public String getCcat_flag_agrupado() {
		return ccat_flag_agrupado;
	}
	public void setCcat_flag_agrupado(String ccat_flag_agrupado) {
		this.ccat_flag_agrupado = ccat_flag_agrupado;
	}
	public String getCcat_ind_componente() {
		return ccat_ind_componente;
	}
	public void setCcat_ind_componente(String ccat_ind_componente) {
		this.ccat_ind_componente = ccat_ind_componente;
	}
	public String getCcat_ind_unidad_activo() {
		return ccat_ind_unidad_activo;
	}
	public void setCcat_ind_unidad_activo(String ccat_ind_unidad_activo) {
		this.ccat_ind_unidad_activo = ccat_ind_unidad_activo;
	}
	public String getCcat_flag_duradero() {
		return ccat_flag_duradero;
	}
	public void setCcat_flag_duradero(String ccat_flag_duradero) {
		this.ccat_flag_duradero = ccat_flag_duradero;
	}
	public String getCcat_alias1() {
		return ccat_alias1;
	}
	public void setCcat_alias1(String ccat_alias1) {
		this.ccat_alias1 = ccat_alias1;
	}
	public String getCcat_alias2() {
		return ccat_alias2;
	}
	public void setCcat_alias2(String ccat_alias2) {
		this.ccat_alias2 = ccat_alias2;
	}
	public String getCcat_alias3() {
		return ccat_alias3;
	}
	public void setCcat_alias3(String ccat_alias3) {
		this.ccat_alias3 = ccat_alias3;
	}
	public String getCcat_tipo_unidad() {
		return ccat_tipo_unidad;
	}
	public void setCcat_tipo_unidad(String ccat_tipo_unidad) {
		this.ccat_tipo_unidad = ccat_tipo_unidad;
	}
	public String getNcat_ano_orden() {
		return ncat_ano_orden;
	}
	public void setNcat_ano_orden(String ncat_ano_orden) {
		this.ncat_ano_orden = ncat_ano_orden;
	}
	public String getNcat_nro_orden() {
		return ncat_nro_orden;
	}
	public void setNcat_nro_orden(String ncat_nro_orden) {
		this.ncat_nro_orden = ncat_nro_orden;
	}
	public String getNcat_tipo_ppto() {
		return ncat_tipo_ppto;
	}
	public void setNcat_tipo_ppto(String ncat_tipo_ppto) {
		this.ncat_tipo_ppto = ncat_tipo_ppto;
	}
	
	
	
}
