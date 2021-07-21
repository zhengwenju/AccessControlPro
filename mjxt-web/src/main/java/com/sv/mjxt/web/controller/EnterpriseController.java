package com.sv.mjxt.web.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.mjxt.web.entity.TbCompanyInfo;
import com.sv.mjxt.web.service.EnterprisesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(tags = "企业相关接口", description = "提供相关 rest api")
@RestController
@RequestMapping("/tbcompanyinfo")
public class EnterpriseController {

	@Autowired
	private EnterprisesService enterprisesService;

	/*
	 * // 企业信息 增 删 改 查
	 * 
	 * @ApiOperation("测试接口")
	 * 
	 * @GetMapping("/hello") public String hello() { return "hello"; }
	 */
	// 查询
	@ApiOperation("查询列表")
	@GetMapping("/selectList")
	public List<TbCompanyInfo> selectList() {
		System.out.print("");
		return enterprisesService.selectList();
	}

	@ApiOperation("查阅")
	@GetMapping("/selectList2")
	public List<TbCompanyInfo> selectList2() {
		return enterprisesService.selectList2();
	}

	// 修改
	@ApiOperation("修改企业")
	@PostMapping("/editUser")
	public int editUser(@RequestBody TbCompanyInfo tbCompanyInfo) {
		tbCompanyInfo.setComId(UUID.randomUUID().toString());// 企业基本信息主键
		tbCompanyInfo.setComName(new String());// 企业名称
		tbCompanyInfo.setUscc(new String());// 企业编号
		tbCompanyInfo.setArea(new String());// 区域
		tbCompanyInfo.setIndustry(new String());// 所属行业
		tbCompanyInfo.setGrade(new String());// 企业等级
		tbCompanyInfo.setLocation(new String());// 企业地址
		tbCompanyInfo.setIp_addr(new String());// 企业ip地址
		tbCompanyInfo.setCoordinator(new String());// 企业经纬度
		tbCompanyInfo.setLegalPerson(new String());// 企业法人
		tbCompanyInfo.setContact(new String()); // 联系人
		tbCompanyInfo.setContactNumber(new String());// 联系人电话
		tbCompanyInfo.setAccessGrade(new String()); // 允许进入车辆等级
		tbCompanyInfo.setGateVolume(new String());// 道闸数量
		tbCompanyInfo.setFlagPerformanceGrade(new String());// 0-绩效未分级,1-绩效分级行业
		return enterprisesService.editUser(tbCompanyInfo);
	}

	@ApiOperation("增加企业")
	@PostMapping("/addUser")
	public int addUser(@RequestBody TbCompanyInfo tbCompanyInfo) {
		tbCompanyInfo.setComId(UUID.randomUUID().toString());// 企业基本信息主键
		tbCompanyInfo.setComName(new String());// 企业名称
		tbCompanyInfo.setUscc(new String());// 企业编号
		tbCompanyInfo.setArea(new String());// 区域
		tbCompanyInfo.setIndustry(new String());// 所属行业
		tbCompanyInfo.setGrade(new String());// 企业等级
		tbCompanyInfo.setLocation(new String());// 企业地址
		tbCompanyInfo.setIp_addr(new String());// 企业ip地址
		tbCompanyInfo.setCoordinator(new String());//企业经纬度
		tbCompanyInfo.setLegalPerson(new String());// 企业法人
		tbCompanyInfo.setContact(new String()); //联系人
		tbCompanyInfo.setContactNumber(new String());//联系人电话
		tbCompanyInfo.setAccessGrade(new String());	//允许进入车辆等级
		tbCompanyInfo.setGateVolume(new String());//道闸数量
		tbCompanyInfo.setFlagPerformanceGrade(new String());// 0-绩效未分级,1-绩效分级行业
		tbCompanyInfo.setFlagDelete(new String());// 0-不删除 1-删除 2-其他
		return enterprisesService.addUser(tbCompanyInfo);
	}

	@ApiOperation("删除企业")
	@PostMapping("/delUser")
	public int delUser(@RequestBody String comId) {
		return enterprisesService.delUser(comId);
	}


}
