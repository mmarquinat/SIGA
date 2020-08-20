package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.S_SagAccCm_Dao;
import com.formacionbdi.springboot.app.siga.entity.SagAccCm;

@Service
public class S_SagAccCm_ServiceImpl implements IS_SagAccCm_Service{
	
	@Autowired
	private S_SagAccCm_Dao sigaCmDao;
	
	@Override
	public List<SagAccCm> findAll() {
		return (List<SagAccCm>) sigaCmDao.findAll();
	}
}
