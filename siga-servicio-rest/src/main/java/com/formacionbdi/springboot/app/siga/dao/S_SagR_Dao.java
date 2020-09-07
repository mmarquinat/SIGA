package com.formacionbdi.springboot.app.siga.dao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.formacionbdi.springboot.app.siga.entity.SagR;
import com.formacionbdi.springboot.app.siga.entity.SagRId;

public interface S_SagR_Dao extends CrudRepository<SagR, SagRId>{
	@Query(
			  value = "SELECT * FROM SAG_RRHH WHERE CORD_CODIGO = :var1 "
			  		+ "AND CPER_CODIGO = :var2 ", 
			  nativeQuery = true)
	SagR findByR(@Param("var1") String var1,
			@Param("var2") String var2);
}
