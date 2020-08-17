package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.SigaAccCmDao;
import com.formacionbdi.springboot.app.siga.entity.SagAccCm;

@Service
public class SigaCmServiceImpl implements ISigaCmService{
	
	@Autowired
	private SigaAccCmDao sigaCmDao;
	
	@Override
	public List<SagAccCm> findAll() {
		return (List<SagAccCm>) sigaCmDao.findAll();
	}
}
