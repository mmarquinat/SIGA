package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.siga.dao.S_CatalogoBienS_Dao;
import com.formacionbdi.springboot.app.siga.entity.CatalogoBienS;

@Service
public class S_CatalogoBienS_ServiceImpl implements IS_CatalogoBienS_Service{

	@Autowired
	private S_CatalogoBienS_Dao sigaCBSDao;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<CatalogoBienS> findAll() {
		return sigaCBSDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public CatalogoBienS findByCBS(String var1, String var2, String var3,
			String var4, String var5, String var6){
		return (CatalogoBienS) sigaCBSDao.findByCBS(var1, var2, var3, var4, var5, var6);
	}
	
}
