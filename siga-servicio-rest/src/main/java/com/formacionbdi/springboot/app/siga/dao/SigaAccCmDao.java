package com.formacionbdi.springboot.app.siga.dao;


import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.siga.entity.SagAccCm;

public interface SigaAccCmDao extends CrudRepository<SagAccCm, Long>{
	 //List<SagAccCm> findByLastName(String CMcodigo);
}
