package com.sv.mjxt.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.mjxt.web.entity.TbVehicleInfo;
import com.sv.mjxt.web.mapper.EnterprisesCarMapper;

@Service
public class EnterprisesCarService implements EnterprisesCarMapper {

	@Autowired
	private EnterprisesCarMapper enterprisesCarMapper;

	@Override
	public List<TbVehicleInfo> selectcar() {
		return enterprisesCarMapper.selectcar();
	}

	@Override
	public List<TbVehicleInfo> selectcar2() {
		return enterprisesCarMapper.selectcar2();
	}

	@Override
	public int editcar(TbVehicleInfo tbVehicleInfo) {
		return enterprisesCarMapper.editcar(tbVehicleInfo);
	}

	@Override
	public int addcar(TbVehicleInfo tbVehicleInfo) {
		return enterprisesCarMapper.addcar(tbVehicleInfo);
	}

	@Override
	public int delcar(String vehicleid) {
		return enterprisesCarMapper.delcar(vehicleid);
	}

}
