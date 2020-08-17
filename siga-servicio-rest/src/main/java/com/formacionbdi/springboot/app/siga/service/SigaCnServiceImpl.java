package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.SigaAccCnDao;
import com.formacionbdi.springboot.app.siga.entity.SagAccCn;

@Service
public class SigaCnServiceImpl implements ISigaCnService{

	@Autowired
	private SigaAccCnDao sigaCnDao;
	
	@Override
	public List<SagAccCn> findAll() {
		return (List<SagAccCn>) sigaCnDao.findAll();
	}
	
}
