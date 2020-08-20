package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.S_GrupoBienS_Dao;
import com.formacionbdi.springboot.app.siga.entity.GrupoBienS;

@Service
public class S_GrupoBienS_ServiceImpl implements IS_GrupoBienS_Service{
	
	@Autowired
	private S_GrupoBienS_Dao sigaGBSDao;
	
	@Override
	public List<GrupoBienS> findAll() {
		return (List<GrupoBienS>) sigaGBSDao.findAll();
	}
}