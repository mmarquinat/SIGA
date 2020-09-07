package com.formacionbdi.springboot.app.siga.dao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.formacionbdi.springboot.app.siga.entity.ClaseBienS;
import com.formacionbdi.springboot.app.siga.entity.ClaseBienSId;
public interface S_ClaseBienS_Dao extends CrudRepository<ClaseBienS, ClaseBienSId>{
	
	@Query(
			  value = "SELECT * FROM CLASE_BIEN_SERV WHERE CCBS_TIPO_BIEN = :var1 "
			  		+ "AND CCBS_GRUPO_BIEN = :var2 "
			  		+ "AND CCBS_CLASE_BIEN = :var3 ", 
			  nativeQuery = true)
	ClaseBienS findByClBS(@Param("var1") String var1,
			@Param("var2") String var2,
			@Param("var3") String var3);

}