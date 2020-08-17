package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.SigaRDao;
import com.formacionbdi.springboot.app.siga.entity.SagR;

@Service
public class SigaRService implements ISigaRService{
	
	@Autowired
	private SigaRDao sigaRDao;
	
	@Override
	public List<SagR> findAll() {
		return (List<SagR>) sigaRDao.findAll();
	}
}
