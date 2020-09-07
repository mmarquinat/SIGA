package com.formacionbdi.springboot.app.siga.service;

import java.util.List;
import java.util.Optional;

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
	public Iterable<SagR> findAll() {
		return (Iterable<SagR>) sigaRDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public SagR findByR(String id1, String id2) {
		return (SagR) sigaRDao.findByR(id1, id2);
	}
}
