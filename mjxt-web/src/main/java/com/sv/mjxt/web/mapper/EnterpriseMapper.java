package com.sv.mjxt.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sv.mjxt.web.entity.TbCompanyInfo;

@Mapper
public interface EnterpriseMapper {

	// 查询列表
	public List<TbCompanyInfo> selectList();

	// 修改
	public int editUser(TbCompanyInfo tbCompanyInfo);

	// 添加
	public int addUser(TbCompanyInfo tbCompanyInfo);

	// 删除
	public int delUser(String comId);

	// 查阅
	public List<TbCompanyInfo> selectList2();

}
