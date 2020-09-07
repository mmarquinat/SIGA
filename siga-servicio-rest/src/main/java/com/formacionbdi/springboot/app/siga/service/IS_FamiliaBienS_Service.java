package com.formacionbdi.springboot.app.siga.service;
import java.util.List;
import com.formacionbdi.springboot.app.siga.entity.FamiliaBienS;
public interface IS_FamiliaBienS_Service {
	public List<FamiliaBienS> findAll();
	public FamiliaBienS findByFBS(String var1, String var2, String var3, String var4);
}