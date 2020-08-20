package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.S_CatalogoBienS_Dao;
import com.formacionbdi.springboot.app.siga.entity.CatalogoBienS;

@Service
public class S_CatalogoBienS_ServiceImpl implements IS_CatalogoBienS_Service{

	@Autowired
	private S_CatalogoBienS_Dao sigaCBDao;
	
	@Override
	public List<CatalogoBienS> findAll() {
		return (List<CatalogoBienS>) sigaCBDao.findAll();
	}
	
}
