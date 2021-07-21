package com.sv.mjxt.web.dao.model;

import lombok.Data;

/**
 * 企业端信息
 * 对应着企业信息中的每一个IP地址信息。
 * 例如企业有四个企业端IP，则id为1~4，企业名称相同，ip分别是四个IP。
 */
@Data
public class Terminal {

	/**
	 * 企业端ID
	 */
	private int id;
	/**
	 * 企业Id
	 */
	private int enterpriseId;
	/**
	 * 企业名称
	 */
	private String enterpriseName;
	/**
	 * 企业端IP
	 */
	private String ip;
	/**
	 * 企业端管控级别
	 */
	private int emergencyLevel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(int enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getEmergencyLevel() {
		return emergencyLevel;
	}
	public void setEmergencyLevel(int emergencyLevel) {
		this.emergencyLevel = emergencyLevel;
	}
	
	
}
