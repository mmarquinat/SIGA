package com.formacionbdi.springboot.app.siga.service;

import java.util.List;

import com.formacionbdi.springboot.app.siga.entity.SagAccCm;

public interface IS_SagAccCm_Service {
	public List<SagAccCm> findAll();
	public SagAccCm findById(String id);
}
