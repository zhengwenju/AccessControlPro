package com.sv.mjxt.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sv.mjxt.web.entity.TbVehicleInfo;

@Mapper
public interface EnterprisesCarMapper {

	List<TbVehicleInfo> selectcar();

	List<TbVehicleInfo> selectcar2();

	int editcar(TbVehicleInfo tbVehicleInfo);

	int addcar(TbVehicleInfo tbVehicleInfo);

	int delcar(String vehicleid);

}
