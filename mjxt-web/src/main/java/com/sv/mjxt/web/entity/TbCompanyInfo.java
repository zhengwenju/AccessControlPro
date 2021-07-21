package com.sv.mjxt.web.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("企业实体--企业信息表 ")
public class TbCompanyInfo {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty("企业基本信息主键")
	private String comId;// 企业基本信息主键

	@ApiModelProperty("企业名称")
	private String comName;// 企业名称

	@ApiModelProperty("统一社会信用代码")
	private String uscc;// 统一社会信用代码

	@ApiModelProperty("区域")
	private String area;// 区域

	@ApiModelProperty("所属行业")
	private String industry;// 所属行业

	@ApiModelProperty("企业等级")
	private String grade;// 企业等级

	@ApiModelProperty("企业地址")
	private String location;// 企业地址

	@ApiModelProperty("企业ip地址")
	private String ip_addr;// 企业ip地址

	@ApiModelProperty("企业坐标")
	private String coordinator;// 企业坐标

	@ApiModelProperty("企业法人")
	private String legalPerson;// 企业法人

	@ApiModelProperty("企业联系人")
	private String contact;// 企业联系人

	@ApiModelProperty("企业联系人电话")
	private String contactNumber;// 企业联系人电话

	@ApiModelProperty("允许进入车辆等级")
	private String accessGrade;// 允许进入车辆等级

	@ApiModelProperty("道闸数量")
	private String gateVolume;// 道闸数量

	@ApiModelProperty("0-绩效未分级,1-绩效分级行业")
	private String flagPerformanceGrade;// 0-绩效未分级,1-绩效分级行业

	@ApiModelProperty("0-不删除 1-删除 2-其他")
	private String flagDelete;// 0-不删除 1-删除 2-其他

	/**
	 * 获取企业中的所有ip,勿删
	 * @return
	 */
	private TbDevice ipDevice;

	public TbDevice getIpDevice() {
		return ipDevice;
	}

	public void setIpDevice(TbDevice ipDevice) {
		this.ipDevice = ipDevice;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getUscc() {
		return uscc;
	}

	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIp_addr() {
		return ip_addr;
	}

	public void setIp_addr(String ip_addr) {
		this.ip_addr = ip_addr;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAccessGrade() {
		return accessGrade;
	}

	public void setAccessGrade(String accessGrade) {
		this.accessGrade = accessGrade;
	}

	public String getGateVolume() {
		return gateVolume;
	}

	public void setGateVolume(String gateVolume) {
		this.gateVolume = gateVolume;
	}

	public String getFlagPerformanceGrade() {
		return flagPerformanceGrade;
	}

	public void setFlagPerformanceGrade(String flagPerformanceGrade) {
		this.flagPerformanceGrade = flagPerformanceGrade;
	}

	public String getFlagDelete() {
		return flagDelete;
	}

	public void setFlagDelete(String flagDelete) {
		this.flagDelete = flagDelete;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TbCompanyInfo [comId=" + comId + ", comName=" + comName + ", uscc=" + uscc + ", area=" + area
				+ ", industry=" + industry + ", grade=" + grade + ", location=" + location + ", ip_addr=" + ip_addr
				+ ", coordinator=" + coordinator + ", legalPerson=" + legalPerson + ", contact=" + contact
				+ ", contactNumber=" + contactNumber + ", accessGrade=" + accessGrade + ", gateVolume=" + gateVolume
				+ ", flagPerformanceGrade=" + flagPerformanceGrade + ", flagDelete=" + flagDelete + "]";
	}

}
