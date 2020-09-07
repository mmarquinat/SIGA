package com.formacionbdi.springboot.app.siga.service;
import com.formacionbdi.springboot.app.siga.entity.SagR;

public interface IS_SagR_Service {
	public Iterable<SagR> findAll();
	public SagR findByR(String id1, String id2);
}
