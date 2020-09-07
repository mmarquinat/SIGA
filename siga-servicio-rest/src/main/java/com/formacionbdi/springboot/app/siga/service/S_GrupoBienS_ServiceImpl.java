package com.formacionbdi.springboot.app.siga.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.formacionbdi.springboot.app.siga.dao.S_GrupoBienS_Dao;
import com.formacionbdi.springboot.app.siga.entity.GrupoBienS;
@Service
public class S_GrupoBienS_ServiceImpl implements IS_GrupoBienS_Service{
	@Autowired
	private S_GrupoBienS_Dao sigaGBSDao;
	@Override
	@Transactional(readOnly = true)
	public List<GrupoBienS> findAll() {
		return (List<GrupoBienS>) sigaGBSDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public GrupoBienS findByGBS(String var1, String var2) {
		return (GrupoBienS) sigaGBSDao.findByGBS(var1, var2);
	}
}