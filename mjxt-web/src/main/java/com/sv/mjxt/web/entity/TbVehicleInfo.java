package com.sv.mjxt.web.entity;

import java.util.Arrays;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("企业车辆信息实体 ")
public class TbVehicleInfo {
    private static final long serialVersionUID = 1L;
	// 企业--车辆信息表
	@ApiModelProperty("车辆id")
	private String vehicleid;

	@ApiModelProperty("初次登记日期")
	private String vehiclePlate;// 初次登记日期

	@ApiModelProperty("车辆颜色")
	private String vehicleColor;// 车辆颜色

	@ApiModelProperty("车辆vin")
    private String vin;
	@ApiModelProperty("排放阶段")
	private String stage;// 排放阶段

	@ApiModelProperty("车辆类型")
	private String vehicleType;// 车辆类型

	@ApiModelProperty("所属人/公司")
	private String owner;// 所属人/公司

	@ApiModelProperty("燃料类型")
	private String fuelType;// 燃料类型

	@ApiModelProperty("使用性质")
	private String property;// 使用性质

	@ApiModelProperty("发动机号码")
	private String engineSN;// 发动机号码

	@ApiModelProperty("发证日期")
	private Date certificationDate;// 发证日期

	@ApiModelProperty("品牌类型")
	private String brandModel;// 品牌类型

	@ApiModelProperty("注册日期")
	private Date registerDate;// 注册日期

	@ApiModelProperty("住址")
	private String address;// 住址

	@ApiModelProperty("初次登记日期")
	private Date firstRegisterDate;// 初次登记日期

	@ApiModelProperty("联系电话")
	private String contactNumber;// 联系电话

	@ApiModelProperty("生产厂商")
	private String manufacturer;// 生产厂商

	@ApiModelProperty("行驶证主页")
	private byte[] vehicleLicenseMp;// 行驶证主页

	@ApiModelProperty("行驶证副页")
	private byte[] vehicleLicenseSp;// 行驶证副页

	@ApiModelProperty("创建者")
	private String creator;// 创建者

	@ApiModelProperty("创建时间")
	private Date createTime;// 创建时间

	@ApiModelProperty("更新者")
	private String updatedBy;// 更新者

	@ApiModelProperty("更新时间")
	private Date updatedTime;// 更新时间

	@ApiModelProperty("环保随车清单")
	private byte[] vehicleList;// 环保随车清单

	@ApiModelProperty("登记类型")
	private String registrationType;// 登记类型

	@ApiModelProperty("是否为场内车辆，1：是 0：否")
	private String flagInternal;// 是否为场内车辆，1：是 0：否

	@ApiModelProperty("总质量")
	private String totalWeight;// 总质量

	@ApiModelProperty("整备质量")
	private String curbWeight;// 整备质量

	@ApiModelProperty("核定载质量")
	private String approvedWeight;// 核定载质量

	@ApiModelProperty("0-不删除 1-删除 2-其他")
	private String flagDelete;// 0-不删除 1-删除 2-其他

	public String getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getEngineSN() {
		return engineSN;
	}

	public void setEngineSN(String engineSN) {
		this.engineSN = engineSN;
	}

	public Date getCertificationDate() {
		return certificationDate;
	}

	public void setCertificationDate(Date certificationDate) {
		this.certificationDate = certificationDate;
	}

	public String getBrandModel() {
		return brandModel;
	}

	public void setBrandModel(String brandModel) {
		this.brandModel = brandModel;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getFirstRegisterDate() {
		return firstRegisterDate;
	}

	public void setFirstRegisterDate(Date firstRegisterDate) {
		this.firstRegisterDate = firstRegisterDate;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public byte[] getVehicleLicenseMp() {
		return vehicleLicenseMp;
	}

	public void setVehicleLicenseMp(byte[] vehicleLicenseMp) {
		this.vehicleLicenseMp = vehicleLicenseMp;
	}

	public byte[] getVehicleLicenseSp() {
		return vehicleLicenseSp;
	}

	public void setVehicleLicenseSp(byte[] vehicleLicenseSp) {
		this.vehicleLicenseSp = vehicleLicenseSp;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public byte[] getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(byte[] vehicleList) {
		this.vehicleList = vehicleList;
	}

	public String getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public String getFlagInternal() {
		return flagInternal;
	}

	public void setFlagInternal(String flagInternal) {
		this.flagInternal = flagInternal;
	}

	public String getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getCurbWeight() {
		return curbWeight;
	}

	public void setCurbWeight(String curbWeight) {
		this.curbWeight = curbWeight;
	}

	public String getApprovedWeight() {
		return approvedWeight;
	}

	public void setApprovedWeight(String approvedWeight) {
		this.approvedWeight = approvedWeight;
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
		return "TbVehicleInfo [vehicleid=" + vehicleid + ", vehiclePlate=" + vehiclePlate + ", vehicleColor="
				+ vehicleColor + ", vin=" + vin + ", stage=" + stage + ", vehicleType=" + vehicleType + ", owner="
				+ owner + ", fuelType=" + fuelType + ", property=" + property + ", engineSN=" + engineSN
				+ ", certificationDate=" + certificationDate + ", brandModel=" + brandModel + ", registerDate="
				+ registerDate + ", address=" + address + ", firstRegisterDate=" + firstRegisterDate
				+ ", contactNumber=" + contactNumber + ", manufacturer=" + manufacturer + ", vehicleLicenseMp="
				+ Arrays.toString(vehicleLicenseMp) + ", vehicleLicenseSp=" + Arrays.toString(vehicleLicenseSp)
				+ ", creator=" + creator + ", createTime=" + createTime + ", updatedBy=" + updatedBy + ", updatedTime="
				+ updatedTime + ", vehicleList=" + Arrays.toString(vehicleList) + ", registrationType="
				+ registrationType + ", flagInternal=" + flagInternal + ", totalWeight=" + totalWeight + ", curbWeight="
				+ curbWeight + ", approvedWeight=" + approvedWeight + ", flagDelete=" + flagDelete + "]";
	}



}
