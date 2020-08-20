package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.S_ClaseBienS_Dao;
import com.formacionbdi.springboot.app.siga.entity.ClaseBienS;

@Service
public class S_ClaseBienS_ServiceImpl implements IS_ClaseBienS_Service{
		
	@Autowired
	private S_ClaseBienS_Dao sigaClBSDao;
		
	@Override
	public List<ClaseBienS> findAll() {
		return (List<ClaseBienS>) sigaClBSDao.findAll();
	}
}

