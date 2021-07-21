package com.sv.mjxt.web.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.mjxt.web.entity.TbVehicleInfo;
import com.sv.mjxt.web.service.EnterprisesCarService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "企业车辆信息接口", description = "提供相关 rest api")
@RestController
@RequestMapping("/tbVehicleInfo")
public class EnterprisesCarController {

	@Autowired
	private EnterprisesCarService enterprisesCarService;
	
	// 查询
	@ApiOperation("查询企业车辆")
	@GetMapping("/selectcar")
	public List<TbVehicleInfo> selectcar() {
		System.out.print("===============<<<aaa>>>>");
		return null;
	}

	@ApiOperation("查阅企业车辆")
	@GetMapping("/selectcar2")
	public List<TbVehicleInfo> selectcar2() {
		return enterprisesCarService.selectcar2();
	}

	// 修改
	@ApiOperation("修改企业车辆信息")
	@PostMapping("/editcar")
	public int editcar(@RequestBody TbVehicleInfo tbVehicleInfo) {
		tbVehicleInfo.setVehicleid(UUID.randomUUID().toString());// 企业基本信息主键
		tbVehicleInfo.setVehiclePlate(new String());// 企业名称
		tbVehicleInfo.setVehicleColor(new String());// 车辆颜色
		tbVehicleInfo.setVin(new String());
		tbVehicleInfo.setStage(new String());// 排放阶段
		tbVehicleInfo.setVehicleType(new String());// 车辆类型
		tbVehicleInfo.setOwner(new String());// 所属人/公司
		tbVehicleInfo.setFuelType(new String());// 燃料类型
		tbVehicleInfo.setProperty(new String());// 使用性质
		tbVehicleInfo.setEngineSN(new String());// 发动机号码
		tbVehicleInfo.setCertificationDate(new Date());// 发证日期
		tbVehicleInfo.setBrandModel(new String());// 品牌类型
		tbVehicleInfo.setRegisterDate(new Date());// 注册日期
		tbVehicleInfo.setAddress(new String());// 地址
		tbVehicleInfo.setFirstRegisterDate(new Date());// 初次登记日期
		tbVehicleInfo.setContactNumber(new String());// 联系电话
		tbVehicleInfo.setManufacturer(new String());// 生产厂商
		tbVehicleInfo.setVehicleLicenseMp(null);// 行驶证主页
		tbVehicleInfo.setVehicleLicenseSp(null);// 行驶证副页
		tbVehicleInfo.setCreator(new String());// 创建人
		tbVehicleInfo.setCreateTime(new Date());// 创建时间
		tbVehicleInfo.setUpdatedBy(new String());// 修改人
		tbVehicleInfo.setUpdatedTime(new Date());// 修改时间
		tbVehicleInfo.setVehicleList(null);// 环保随车清单
		tbVehicleInfo.setRegistrationType(new String());// 登记类型
		tbVehicleInfo.setFlagInternal(new String());// 是否为场内车辆，1：是 0：否
		tbVehicleInfo.setTotalWeight(new String());// 车辆质量
		tbVehicleInfo.setCurbWeight(new String());// 整备质量
		tbVehicleInfo.setApprovedWeight(new String());// 核定载质量
		return enterprisesCarService.editcar(tbVehicleInfo);
	}

	@ApiOperation("增加企业车辆信息")
	@PostMapping("/addcar")
	public int addcar(@RequestBody TbVehicleInfo tbVehicleInfo) {
		tbVehicleInfo.setVehicleid(UUID.randomUUID().toString());// 企业基本信息主键
		tbVehicleInfo.setVehiclePlate(new String());// 企业名称
		tbVehicleInfo.setVehicleColor(new String());// 车辆颜色
		tbVehicleInfo.setVin(new String());
		tbVehicleInfo.setStage(new String());// 排放阶段
		tbVehicleInfo.setVehicleType(new String());// 车辆类型
		tbVehicleInfo.setOwner(new String());// 所属人/公司
		tbVehicleInfo.setFuelType(new String());// 燃料类型
		tbVehicleInfo.setProperty(new String());// 使用性质
		tbVehicleInfo.setEngineSN(new String());// 发动机号码
		tbVehicleInfo.setCertificationDate(new Date());// 发证日期
		tbVehicleInfo.setBrandModel(new String());// 品牌类型
		tbVehicleInfo.setRegisterDate(new Date());// 注册日期
		tbVehicleInfo.setAddress(new String());// 地址
		tbVehicleInfo.setFirstRegisterDate(new Date());// 初次登记日期
		tbVehicleInfo.setContactNumber(new String());// 联系电话
		tbVehicleInfo.setManufacturer(new String());// 生产厂商
		tbVehicleInfo.setVehicleLicenseMp(null);// 行驶证主页
		tbVehicleInfo.setVehicleLicenseSp(null);// 行驶证副页
		tbVehicleInfo.setCreator(new String());// 创建人
		tbVehicleInfo.setCreateTime(new Date());// 创建时间
		tbVehicleInfo.setUpdatedBy(new String());// 修改人
		tbVehicleInfo.setUpdatedTime(new Date());// 修改时间
		tbVehicleInfo.setVehicleList(null);// 环保随车清单
		tbVehicleInfo.setRegistrationType(new String());// 登记类型
		tbVehicleInfo.setFlagInternal(new String());// 是否为场内车辆，1：是 0：否
		tbVehicleInfo.setTotalWeight(new String());// 车辆质量
		tbVehicleInfo.setCurbWeight(new String());// 整备质量
		tbVehicleInfo.setApprovedWeight(new String());// 核定载质量
		return enterprisesCarService.addcar(tbVehicleInfo);
	}

	@ApiOperation("删除企业车辆信息")
	@PostMapping("/delcar")
	public int delcar(@RequestBody String vehicleid) {
		return enterprisesCarService.delcar(vehicleid);
	}

}
