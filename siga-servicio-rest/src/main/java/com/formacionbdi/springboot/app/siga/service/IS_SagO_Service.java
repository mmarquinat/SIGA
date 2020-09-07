package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import com.formacionbdi.springboot.app.siga.entity.SagO;

public interface IS_SagO_Service {
	public List<SagO> findAll();
	public SagO findById(String id);
}
