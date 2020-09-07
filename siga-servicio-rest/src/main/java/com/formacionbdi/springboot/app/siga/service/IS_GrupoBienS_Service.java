package com.formacionbdi.springboot.app.siga.service;
import com.formacionbdi.springboot.app.siga.entity.GrupoBienS;
public interface IS_GrupoBienS_Service {
	public Iterable<GrupoBienS> findAll();
	public GrupoBienS findByGBS(String var1, String var2);
}
