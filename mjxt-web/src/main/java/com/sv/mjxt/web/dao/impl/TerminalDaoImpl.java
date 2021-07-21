package com.sv.mjxt.web.dao.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.sv.mjxt.web.dao.model.Terminal;
import com.sv.mjxt.web.mapper.TerminalDao;

@Repository
public class TerminalDaoImpl implements TerminalDao{

	@Override
	public List<Terminal> queryAll() {
		
		
		Terminal t1 = new Terminal();
		t1.setId(1);
		t1.setEnterpriseId(1);
		t1.setEnterpriseName("大禹货运物流公司");
		t1.setEmergencyLevel(0);
		t1.setIp("127.0.0.1");
		Terminal t2 = new Terminal();
		t1.setId(2);
		t1.setEnterpriseId(1);
		t1.setEnterpriseName("大禹货运物流公司");
		t1.setEmergencyLevel(0);
		t1.setIp("localhost");
		
		return Stream.of(t1, t2).collect(Collectors.toList());
	}

}
