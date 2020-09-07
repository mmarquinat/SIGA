package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.siga.dao.S_SagAccCm_Dao;
import com.formacionbdi.springboot.app.siga.entity.SagAccCm;

@Service
public class S_SagAccCm_ServiceImpl implements IS_SagAccCm_Service{
	
	@Autowired
	private S_SagAccCm_Dao sigaCmDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<SagAccCm> findAll() {
		return (List<SagAccCm>) sigaCmDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public SagAccCm findById(String id) {
		return sigaCmDao.findById(id).orElse(null);
	}

}
