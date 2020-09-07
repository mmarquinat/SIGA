package com.formacionbdi.springboot.app.siga.service;
import java.util.List;
import com.formacionbdi.springboot.app.siga.entity.GrupoBienS;
public interface IS_GrupoBienS_Service {
	public List<GrupoBienS> findAll();
	public GrupoBienS findByGBS(String var1, String var2);
}
