package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.SigaODao;
import com.formacionbdi.springboot.app.siga.entity.SagO;

@Service
public class SigaOService implements ISigaOService{

	@Autowired
	private SigaODao sigaODao;
	
	@Override
	public List<SagO> findAll() {
		return (List<SagO>) sigaODao.findAll();
	}
}
