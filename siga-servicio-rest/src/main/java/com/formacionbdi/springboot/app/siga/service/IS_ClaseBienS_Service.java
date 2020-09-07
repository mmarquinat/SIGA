package com.formacionbdi.springboot.app.siga.service;
import com.formacionbdi.springboot.app.siga.entity.ClaseBienS;
public interface IS_ClaseBienS_Service {
	public Iterable<ClaseBienS> findAll();
	public ClaseBienS findByClBS(String var1, String var2, String var3);
}