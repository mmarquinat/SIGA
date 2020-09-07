package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import com.formacionbdi.springboot.app.siga.entity.SagAccCn;

public interface IS_SagAccCn_Service {
	public List<SagAccCn> findAll();
	public SagAccCn findById(String id);
}
