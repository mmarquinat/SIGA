package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.siga.dao.S_SagAccCn_Dao;
import com.formacionbdi.springboot.app.siga.entity.SagAccCn;

@Service
public class S_SagAccCn_ServiceImpl implements IS_SagAccCn_Service{

	@Autowired
	private S_SagAccCn_Dao sigaCnDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<SagAccCn> findAll() {
		return (List<SagAccCn>) sigaCnDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public SagAccCn findById(String id) {
		return sigaCnDao.findById(id).orElse(null);
	}
}
