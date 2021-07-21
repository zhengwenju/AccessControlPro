package com.sv.mjxt.web.mapper;

import com.sv.mjxt.web.dao.model.Terminal;

import java.util.List;

public interface TerminalMapper {
    /**
     * 查询所有有效的企业端信息
     */
    public List<Terminal> selectAll() ;
}
