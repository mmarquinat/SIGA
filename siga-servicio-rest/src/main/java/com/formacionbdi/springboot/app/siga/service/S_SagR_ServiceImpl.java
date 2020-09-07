package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.siga.dao.S_SagR_Dao;
import com.formacionbdi.springboot.app.siga.entity.SagR;

@Service
public class S_SagR_ServiceImpl implements IS_SagR_Service{
	
	@Autowired
	private S_SagR_Dao sigaRDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<SagR> findAll() {
		return (List<SagR>) sigaRDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public SagR findById(String id) {
		return sigaRDao.findById(id).orElse(null);
	}
}
