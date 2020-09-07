package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.siga.dao.S_ClaseBienS_Dao;
import com.formacionbdi.springboot.app.siga.entity.ClaseBienS;

@Service
public class S_ClaseBienS_ServiceImpl implements IS_ClaseBienS_Service{
		
	@Autowired
	private S_ClaseBienS_Dao sigaClBSDao;
		
	@Override
	@Transactional(readOnly = true)
	public List<ClaseBienS> findAll() {
		return (List<ClaseBienS>) sigaClBSDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public ClaseBienS findByClBS(String var1, String var2, String var3) {
			return (ClaseBienS) sigaClBSDao.findByClBS(var1, var2, var3);
	}
}

