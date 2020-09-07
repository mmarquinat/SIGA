package com.formacionbdi.springboot.app.siga.service;
import com.formacionbdi.springboot.app.siga.entity.CatalogoBienS;
public interface IS_CatalogoBienS_Service {
	public Iterable<CatalogoBienS> findAll();
	public CatalogoBienS findByCBS(String var1, String var2, String var3, String var4, String var5, String var6);
}
