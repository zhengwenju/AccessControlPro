package com.sv.mjxt.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.mjxt.web.entity.TbCompanyInfo;
import com.sv.mjxt.web.mapper.EnterpriseMapper;

@Service()
public class EnterprisesService implements EnterpriseMapper {

	@Autowired
	private EnterpriseMapper enterpriseMapper;

	// 查询
	@Override
	public List<TbCompanyInfo> selectList() {
		return enterpriseMapper.selectList();
	}

	// 修改
	@Override
	public int editUser(TbCompanyInfo tbCompanyInfo) {
		return enterpriseMapper.editUser(tbCompanyInfo);
	}

	// 添加
	@Override
	public int addUser(TbCompanyInfo tbCompanyInfo) {
		return enterpriseMapper.addUser(tbCompanyInfo);
	}

	// 删除
	@Override
	public int delUser(String comId) {
		return enterpriseMapper.delUser(comId);
	}

	// 查阅
	@Override
	public List<TbCompanyInfo> selectList2() {
		return enterpriseMapper.selectList2();
	}
	
	
}
