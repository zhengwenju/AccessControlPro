package com.sv.mjxt.web.dao.model;

import lombok.Data;

@Data
public class EmergencyManagement {

	private int companyId;
	
	private String companyName;
	
	private int regionId;
	
	private String regionName;

	private int emergencyLevel;
}