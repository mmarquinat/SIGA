package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.SigaDao;
import com.formacionbdi.springboot.app.siga.entity.SagAccCn;

@Service
public class SigaServiceImpl implements ISigaService{

	@Autowired
	private SigaDao sigaDao;
	
	@Override
	public List<SagAccCn> findAll() {
		return (List<SagAccCn>) sigaDao.findAll();
	}
}
