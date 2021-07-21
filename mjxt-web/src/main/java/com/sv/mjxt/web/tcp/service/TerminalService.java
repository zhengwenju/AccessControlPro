package com.sv.mjxt.web.tcp.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.sv.mjxt.web.mapper.TerminalDao;
import com.sv.mjxt.web.dao.model.Terminal;

/**
 * 
 */
@Service
public class TerminalService {

	
	@Autowired
	private TerminalDao terminalDao;
	
	@PostConstruct
	public void init() {
		loadTerminalInfo();
	}
	
	// 企业终端信息
	private Set<Terminal> terminalInfo = new HashSet<>();
	// 启动时和每分钟加载企业端信息
	// 发现有新的企业端，以及企业端管控级别发生变更，需要主动下发管控级别信息
	@Scheduled(fixedDelay = 60 * 1000)
	public void loadTerminalInfo() {
		List<Terminal> terminals = terminalDao.queryAll();
		if (terminals == null || terminals.isEmpty()) {
			terminalInfo.clear();
		} else {
			terminalInfo = terminals.stream().collect(Collectors.toSet());
		}
	}
	
	/**
	 * 根据企业端IP，获取企业端信息
	 */
	public Terminal findTerminalByIP(String clientIP) {
		return terminalInfo.stream().filter(e -> clientIP.equals(e.getIp())).findFirst().orElse(null);
	}
	private Terminal findTerminalById(int terminalId) {
		return terminalInfo.stream().filter(t->t.getId()==terminalId).findFirst().orElse(null);
	}
	
	public int findEmergencyLevel(int terminalId) {
		Terminal terminal = findTerminalById(terminalId);
		return terminal.getEmergencyLevel();
	}
}
