package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.S_FamiliaBienS_Dao;
import com.formacionbdi.springboot.app.siga.entity.FamiliaBienS;

@Service
public class S_FamiliaBienS_ServiceImpl implements IS_FamiliaBienS_Service{

	@Autowired
	private S_FamiliaBienS_Dao sigaFBSDao;
	
	@Override
	public List<FamiliaBienS> findAll() {
		return (List<FamiliaBienS>) sigaFBSDao.findAll();
	}
}
