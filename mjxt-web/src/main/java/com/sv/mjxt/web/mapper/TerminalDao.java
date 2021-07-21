package com.sv.mjxt.web.mapper;

import java.util.List;

import com.sv.mjxt.web.dao.model.Terminal;

public interface TerminalDao {

	/**
	 * 查询所有有效的企业端信息
	 */
	public List<Terminal> queryAll() ; 
}
