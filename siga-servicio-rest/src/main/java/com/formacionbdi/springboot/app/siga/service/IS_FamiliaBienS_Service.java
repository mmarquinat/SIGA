package com.formacionbdi.springboot.app.siga.service;
import com.formacionbdi.springboot.app.siga.entity.FamiliaBienS;
public interface IS_FamiliaBienS_Service {
	public Iterable<FamiliaBienS> findAll();
	public FamiliaBienS findByFBS(String var1, String var2, String var3, String var4);
}