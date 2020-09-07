package com.formacionbdi.springboot.app.siga.dao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.formacionbdi.springboot.app.siga.entity.FamiliaBienS;
public interface S_FamiliaBienS_Dao extends CrudRepository<FamiliaBienS, String>{
	@Query(
			  value = "SELECT * FROM FAMILIA_BIEN_SERV WHERE CFBS_TIPO_BIEN = :var1 "
			  		+ "AND CFBS_GRUPO_BIEN = :var2 "
			  		+ "AND CFBS_CLASE_BIEN = :var3 "
			  		+ "AND FAMILIA_BIEN = :var4", 
			  nativeQuery = true)
	FamiliaBienS findByFBS(@Param("var1") String var1,
			@Param("var2") String var2,
			@Param("var3") String var3,
			@Param("var4") String var4);
}