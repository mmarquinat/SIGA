package com.formacionbdi.springboot.app.siga.service;
import java.util.List;
import com.formacionbdi.springboot.app.siga.entity.ClaseBienS;
public interface IS_ClaseBienS_Service {
	public List<ClaseBienS> findAll();
	public ClaseBienS findByClBS(String var1, String var2, String var3);
}