package com.sv.mjxt.web.tcp.server.model;

import java.util.Date;

import lombok.Data;

/**
 * 车辆进出记录
 */
@Data
public class AccessRecord {

	/**
	 * 主键
	 */
	private long id;
	/**
	 * 序列号
	 * 企业端主键
	 */
	private String serialNo;
	/**
	 * 车牌号
	 */
	private String vehicleNo;
	/**
	 * 进出记录关联号
	 * 将同一车辆的进入和离开记录关联起来的号码
	 */
	private String associatedNo;
	/**
	 * 车辆所属企业Id
	 */
	private int vehicleEnterpriseId;
	/**
	 * 车辆所属企业名称
	 */
	private String vehicleEnterpriseName;
	/**
	 * 车辆访问企业Id
	 */
	private int accessEnterpriseId;
	/**
	 * 车辆访问企业名称
	 */
	private String accessEnterpriseName;
	/**
	 * 车辆访问企业端Id
	 */
	private String accessTerminalId;
	/**
	 * 车辆访问企业端名称
	 */
	private String accessTerminalName;
	/**
	 * 车辆访问企业端IP
	 */
	private String accessTerminalIP;
	/**
	 * 进出场类型 1-进场 2-出场 3-其他
	 */
	private int accessType;
	/**
	 * 进出场时间
	 */
	private Date accessTime;
	/**
	 * 进出场照片路径
	 */
	private int accessImageUrl;
	/**
	 * 进出场视频路径（管控车辆进出场时必填）
	 */
	private int accessVideoUrl;
	/**
	 * 车辆进出场时刻的企业管控级别
	 */
	private int emergencyLevel;
	/**
	 * 企业判定的是否管控车辆 1-否 2-是
	 */
	private int emergencyVehicle;
//	/**
//	 * 是否强制放行 1-否 2-是
//	 */
//	private int forcePass;
	/**
	 * 强制放行原因
	 */
	private String forcePassReason;
	/**
	 * 车辆进出场时刻服务端记录的企业管控级别
	 */
	private int serverEmergencyLevel;
	/**
	 * 服务端判定的是否管控车辆 1-否 2-是
	 */
	private int serverEmergencyVehicle;
	/**
	 * 服务端接收数据的时间
	 */
	private Date serverTime;
}
