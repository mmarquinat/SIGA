package com.formacionbdi.springboot.app.siga.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.formacionbdi.springboot.app.siga.dao.S_FamiliaBienS_Dao;
import com.formacionbdi.springboot.app.siga.entity.FamiliaBienS;
@Service
public class S_FamiliaBienS_ServiceImpl implements IS_FamiliaBienS_Service{
	@Autowired
	private S_FamiliaBienS_Dao sigaFBSDao;
	@Override
	@Transactional(readOnly = true)
	public List<FamiliaBienS> findAll() {
		return (List<FamiliaBienS>) sigaFBSDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public FamiliaBienS findByFBS(String var1, String var2, String var3, String var4) {
		return (FamiliaBienS) sigaFBSDao.findByFBS(var1, var2, var3, var4);
	}
}
