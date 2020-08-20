package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.siga.dao.S_SagR_Dao;
import com.formacionbdi.springboot.app.siga.entity.SagR;

@Service
public class S_SagR_ServiceImpl implements IS_SagR_Service{
	
	@Autowired
	private S_SagR_Dao sigaRDao;
	
	@Override
	public List<SagR> findAll() {
		return (List<SagR>) sigaRDao.findAll();
	}
}
