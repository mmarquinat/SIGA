package com.formacionbdi.springboot.app.siga.dao;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.formacionbdi.springboot.app.siga.entity.GrupoBienS;
import com.formacionbdi.springboot.app.siga.entity.GrupoBienSId;
public interface S_GrupoBienS_Dao extends CrudRepository<GrupoBienS, GrupoBienSId>{
	@Query(
			  value = "SELECT DISTINCT * FROM GRUPO_BIEN_SERV GROUP BY tipo_bien, grupo_bien", 
			  nativeQuery = true)
	List<GrupoBienS> findByTodos();
	@Query(
			  value = "SELECT * FROM GRUPO_BIEN_SERV WHERE TIPO_BIEN = :var1 "
			  		+ "AND GRUPO_BIEN = :var2 ", 
			  nativeQuery = true)
	GrupoBienS findByGBS(@Param("var1") String var1,
			@Param("var2") String var2);
}