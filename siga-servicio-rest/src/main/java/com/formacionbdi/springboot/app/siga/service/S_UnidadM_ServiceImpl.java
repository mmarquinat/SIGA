package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.siga.dao.S_UnidadM_Dao;
import com.formacionbdi.springboot.app.siga.entity.UnidadM;

@Service
public class S_UnidadM_ServiceImpl implements IS_UnidadM_Service{
	@Autowired
	private S_UnidadM_Dao sigaUMDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<UnidadM> findAll() {
		return (List<UnidadM>) sigaUMDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public UnidadM findById(String id) {
		return sigaUMDao.findById(id).orElse(null);
	}
}
