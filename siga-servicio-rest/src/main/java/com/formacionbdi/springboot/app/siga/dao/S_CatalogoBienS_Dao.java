package com.formacionbdi.springboot.app.siga.dao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.formacionbdi.springboot.app.siga.entity.CatalogoBienS;
public interface S_CatalogoBienS_Dao extends CrudRepository<CatalogoBienS, String>{
	
	@Query(
			  value = "SELECT * FROM CATALOGO_BIEN_SERV WHERE NCAT_SEC_EJEC = :var1 "
			  		+ "AND CCAT_TIPO_BIEN = :var2 "
			  		+ "AND CCAT_GRUPO_BIEN = :var3 "
			  		+ "AND CCAT_CLASE_BIEN = :var4 "
			  		+ "AND CCAT_FAMILIA_BIEN = :var5 "
			  		+ "AND ITEM_BIEN = :var6 ",
			  nativeQuery = true)
	CatalogoBienS findByCBS(@Param("var1") String var1,
			@Param("var2") String var2,
			@Param("var3") String var3,
			@Param("var4") String var4,
			@Param("var5") String var5,
			@Param("var6") String var6);
}
