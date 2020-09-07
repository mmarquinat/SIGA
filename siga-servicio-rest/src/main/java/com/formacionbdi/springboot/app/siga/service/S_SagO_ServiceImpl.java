package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.S_SagO_Dao;
import com.formacionbdi.springboot.app.siga.entity.SagO;

@Service
public class S_SagO_ServiceImpl implements IS_SagO_Service{

	@Autowired
	private S_SagO_Dao sigaODao;
	
	@Override
	@Transactional(readOnly = true)
	public List<SagO> findAll() {
		return (List<SagO>) sigaODao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public SagO findById(String id) {
		return sigaODao.findById(id).orElse(null);
	}
}
