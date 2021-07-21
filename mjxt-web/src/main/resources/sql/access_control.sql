/*
Navicat MySQL Data Transfer

Source Server         : 245
Source Server Version : 50732
Source Host           : 192.168.16.245:3306
Source Database       : access_control

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2021-07-16 16:46:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `dept_name` varchar(20) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '部门名称',
  `parent_id` int(11) NOT NULL DEFAULT '-1' COMMENT '上级部门id',
  `ancestor_list` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '上级列表',
  `order_number` int(11) DEFAULT NULL COMMENT '显示顺序',
  `dept_status` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '1' COMMENT '部门状态：1-正常 0-停用 2-删除',
  `person_incharge` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '负责人',
  `contact_number` varchar(20) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '联系方式',
  `mailbox` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '邮箱',
  `flag_delete` varchar(1) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0' COMMENT '删除标识：1-删除 0-未删除',
  `creator` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_by` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '更新者',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=228 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='部门表';

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '菜单名称',
  `parent_id` bigint(20) DEFAULT '0' COMMENT '父菜单ID',
  `order_num` int(4) DEFAULT '0' COMMENT '显示顺序',
  `path` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '' COMMENT '路由地址',
  `component` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '组件路径',
  `is_frame` int(1) DEFAULT '0' COMMENT '是否为外链:1-是 0-否）',
  `menu_type` char(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '' COMMENT '菜单类型:M-目录 C-菜单 F-按钮',
  `visible` char(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '1' COMMENT '菜单状态（1显示 0隐藏）',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '1' COMMENT '菜单状态（1正常 0停用）',
  `perms` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '权限标识',
  `icon` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '#' COMMENT '菜单图标',
  `creator` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '' COMMENT '更新者',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Table structure for sys_notice
-- ----------------------------
DROP TABLE IF EXISTS `sys_notice`;
CREATE TABLE `sys_notice` (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公告ID',
  `notice_title` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '公告标题',
  `notice_type` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '公告类型',
  `notice_content` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '公告内容',
  `notice_status` varchar(1) COLLATE utf8_unicode_ci DEFAULT '1' COMMENT '公告状态:1-正常 2-停用 3-其他',
  `creator` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_by` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '更新者',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`notice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='公告表';

-- ----------------------------
-- Table structure for Sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `Sys_permission`;
CREATE TABLE `Sys_permission` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `url` varchar(200) NOT NULL,
  `pid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for Sys_permission_role
-- ----------------------------
DROP TABLE IF EXISTS `Sys_permission_role`;
CREATE TABLE `Sys_permission_role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) unsigned NOT NULL,
  `permission_id` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for sys_region
-- ----------------------------
DROP TABLE IF EXISTS `sys_region`;
CREATE TABLE `sys_region` (
  `id` bigint(20) NOT NULL COMMENT '区划代码',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `pid` bigint(20) DEFAULT NULL COMMENT '父级区划代码',
  `province_code` bigint(20) DEFAULT NULL COMMENT '省代码',
  `city_code` bigint(20) DEFAULT NULL COMMENT '市代码',
  `area_code` bigint(20) DEFAULT NULL COMMENT '区代码',
  `street_code` bigint(20) DEFAULT NULL COMMENT '街道代码',
  `committee_code` bigint(20) DEFAULT NULL COMMENT '居委/社区',
  `short_name` varchar(50) DEFAULT NULL COMMENT '简称',
  `city_no` varchar(10) DEFAULT NULL COMMENT '区号',
  `lng` varchar(20) DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) DEFAULT NULL COMMENT '纬度',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `level` int(4) DEFAULT NULL COMMENT '级别: 0-国家 ,1-省, 2-市, 3-区/县, 4-街/镇, 5-社区/居委',
  PRIMARY KEY (`id`),
  KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='区域信息表-5级';

-- ----------------------------
-- Table structure for Sys_Role
-- ----------------------------
DROP TABLE IF EXISTS `Sys_Role`;
CREATE TABLE `Sys_Role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for Sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `Sys_role_user`;
CREATE TABLE `Sys_role_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `sys_user_id` bigint(20) unsigned NOT NULL,
  `sys_role_id` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for Sys_User
-- ----------------------------
DROP TABLE IF EXISTS `Sys_User`;
CREATE TABLE `Sys_User` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for t_accesscontrol
-- ----------------------------
DROP TABLE IF EXISTS `t_accesscontrol`;
CREATE TABLE `t_accesscontrol` (
  `ac_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '门禁主键',
  `ac_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '门禁名称',
  `ac_type` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '门禁类型',
  `ac_location` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '门禁地址',
  `creator` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_by` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '更新者',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  `in_out_type` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '进出类型',
  PRIMARY KEY (`ac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='门禁信息表';

-- ----------------------------
-- Table structure for t_check_record
-- ----------------------------
DROP TABLE IF EXISTS `t_check_record`;
CREATE TABLE `t_check_record` (
  `check_id` bigint(20) NOT NULL COMMENT '检查id',
  `check_person` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '督导人',
  `arrive_time` datetime DEFAULT NULL COMMENT '到厂时间',
  `problem_type` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '问题项',
  `problem_reason` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '问题原因',
  `promised_settle_time` datetime DEFAULT NULL COMMENT '承诺修复时间',
  `measure` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '解决措施',
  `image_url` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '照片路径',
  PRIMARY KEY (`check_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='督查表';

-- ----------------------------
-- Table structure for t_company_emergency
-- ----------------------------
DROP TABLE IF EXISTS `t_company_emergency`;
CREATE TABLE `t_company_emergency` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `com_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '企业基本信息主键',
  `er_id` int(11) NOT NULL DEFAULT '-1' COMMENT '应急响应主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='企业应急相应关联表';

-- ----------------------------
-- Table structure for t_company_info
-- ----------------------------
DROP TABLE IF EXISTS `t_company_info`;
CREATE TABLE `t_company_info` (
  `com_id` varchar(10) COLLATE utf8_unicode_ci NOT NULL COMMENT '企业基本信息主键',
  `com_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '企业名称',
  `uscc` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '统一社会信用代码',
  `area` varchar(100) COLLATE utf8_unicode_ci NOT NULL COMMENT '区域',
  `industry` varchar(20) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '所属行业',
  `grade` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '企业等级',
  `location` varchar(200) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '企业地址',
  `ip_addr` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '企业ip地址',
  `coordinator` varchar(40) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '企业坐标',
  `legal_person` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '企业法人',
  `contact` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '联系人',
  `contact_number` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '企业联系人电话',
  `access_grade` varchar(20) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '允许进入车辆等级',
  `gate_volume` varchar(10) COLLATE utf8_unicode_ci NOT NULL COMMENT '道闸数量',
  `flag_performance_grade` varchar(2) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '0-绩效未分级,1-绩效分级行业 ',
  `flag_delete` varchar(1) COLLATE utf8_unicode_ci DEFAULT '0' COMMENT '0-不删除 1-删除 2-其他',
  PRIMARY KEY (`com_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='企业基本信息表';

-- ----------------------------
-- Table structure for t_device
-- ----------------------------
DROP TABLE IF EXISTS `t_device`;
CREATE TABLE `t_device` (
  `device_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '设备主键',
  `device_sn` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '设备编号',
  `ac_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '门禁主键',
  `device_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '设备名称',
  `device_brand` varchar(32) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '设备品牌',
  `com_id` bigint(20) NOT NULL COMMENT '企业id',
  `com_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '所属公司',
  `device_type` varchar(32) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '设备型号',
  `device_ip` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '设备ip',
  `status` char(2) COLLATE utf8_unicode_ci NOT NULL DEFAULT '1' COMMENT '1-在线 0-掉线 2-其他',
  `creator` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '更新时间',
  `updated_by` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '更新者',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  `direction` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '1' COMMENT '方向：1-进口 0-出口 2-未定义',
  `emergency_level` int(11) NOT NULL DEFAULT '0' COMMENT '管控级别',
  PRIMARY KEY (`device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='设备信息表';

-- ----------------------------
-- Table structure for t_emergency_response
-- ----------------------------
DROP TABLE IF EXISTS `t_emergency_response`;
CREATE TABLE `t_emergency_response` (
  `er_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '应急响应主键',
  `er_level` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '应急响应等级',
  `er_start_time` datetime DEFAULT NULL,
  `er_end_time` datetime DEFAULT NULL,
  `status` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '1' COMMENT '1：实行 0：停止 2：其他',
  `create_by` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `create_time` datetime DEFAULT NULL,
  `updated_by` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`er_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='应急响应表';

-- ----------------------------
-- Table structure for t_non_machinery
-- ----------------------------
DROP TABLE IF EXISTS `t_non_machinery`;
CREATE TABLE `t_non_machinery` (
  `nrm_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '非道路机械主键',
  `env_code` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '环保登记编码',
  `product_date` date DEFAULT NULL COMMENT '生产日期',
  `stage` varchar(255) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '排放阶段',
  `menv_code` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '机械环保代码',
  `engine_brand` mediumblob COMMENT '发动机铭牌',
  `flag_internal` varchar(2) COLLATE utf8_unicode_ci NOT NULL DEFAULT '2' COMMENT '是否为场内机械：1-是 0-否 2-其他',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `produced_country` varchar(50) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '生产国家',
  `type` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '非道路机械类型:挖掘机、推土机、叉车、吊车、其他',
  PRIMARY KEY (`nrm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='非道路机械信息表';

-- ----------------------------
-- Table structure for t_non_machinery_record
-- ----------------------------
DROP TABLE IF EXISTS `t_non_machinery_record`;
CREATE TABLE `t_non_machinery_record` (
  `nrmac_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '非道路机械通行记录主键',
  `nrm_id` bigint(20) NOT NULL COMMENT '非道路机械主键',
  `ac_id` bigint(20) NOT NULL COMMENT '门禁主键',
  `direction` varchar(5) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '方向',
  `create_time` datetime DEFAULT NULL,
  `flag_forbidden` char(2) COLLATE utf8_unicode_ci NOT NULL DEFAULT '2' COMMENT '是否禁行：1-禁行 0-通行 2-其他',
  `reason_forbidden` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reason_release` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`nrmac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='非道路机械通行记录表';

-- ----------------------------
-- Table structure for t_truck_prod_info
-- ----------------------------
DROP TABLE IF EXISTS `t_truck_prod_info`;
CREATE TABLE `t_truck_prod_info` (
  `trpr_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '车辆货物登记主键',
  `ab_id` bigint(20) NOT NULL COMMENT '通行台账主键',
  `vehicle_plate` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '车牌号',
  `tr_pro_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '运输货物名称',
  `tr_weigtht` decimal(10,0) DEFAULT NULL COMMENT '运输量',
  `tr_org_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '车队名称',
  `creator` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`trpr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='货物登记表';

-- ----------------------------
-- Table structure for t_vehicle_access_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_vehicle_access_detail`;
CREATE TABLE `t_vehicle_access_detail` (
  `abd_id` bigint(20) NOT NULL COMMENT '通行台账明细主键',
  `ab_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '通行台账主键',
  `serial_number` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '流水号',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `gate_no` bigint(20) NOT NULL DEFAULT '-1' COMMENT '道闸编号',
  `gate_status` varchar(10) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '道闸状态',
  `status_enter` varchar(1) COLLATE utf8_unicode_ci NOT NULL DEFAULT '2' COMMENT '进出场状态：1-进场 0-出场 2-其他',
  `vehicle_enter_pic` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '入口图片路径',
  `vehicle_out_pic` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '出口图片路径',
  `video_url` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '视频路径',
  `reason_release` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '强制放行原因',
  `reason_no_enter` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '禁止通行原因',
  PRIMARY KEY (`abd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='车辆通行记录明细表';

-- ----------------------------
-- Table structure for t_vehicle_access_record
-- ----------------------------
DROP TABLE IF EXISTS `t_vehicle_access_record`;
CREATE TABLE `t_vehicle_access_record` (
  `ab_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '通行台账主键',
  `ac_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '门禁主键',
  `vehicle_plate` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '车牌号码',
  `vehicle_color` varchar(6) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '车辆颜色',
  `vehicle_type` varchar(10) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '车辆类型：1-小客车 2-货车 3-其他',
  `stage` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '排放阶段',
  `entry_time` datetime DEFAULT NULL COMMENT '进场时间',
  `out_time` datetime DEFAULT NULL COMMENT '出场时间',
  `flag_forbidden` char(1) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0' COMMENT '是否禁行：1-禁行 0-通行',
  `flag_undercontrol` char(1) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0' COMMENT '是否管控：1-管控 0-不管控',
  `duration` float DEFAULT NULL COMMENT '停留时长',
  `direction` varchar(5) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '方向',
  `reason_forbidden` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '禁行原因',
  `remark` varchar(200) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`ab_id`),
  KEY `index_vehicle_plate` (`vehicle_plate`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='车辆通行记录主表';

-- ----------------------------
-- Table structure for t_vehicle_info
-- ----------------------------
DROP TABLE IF EXISTS `t_vehicle_info`;
CREATE TABLE `t_vehicle_info` (
  `vehicle_id` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `vehicle_plate` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '车牌号',
  `vehicle_color` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '车辆颜色',
  `vin` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '车辆识别码',
  `stage` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '排放阶段',
  `vehicle_type` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '车辆类型 ：小客车、货车',
  `owner` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '所属人/公司',
  `fuel_type` varchar(20) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '燃料类型',
  `property` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '使用性质',
  `engine_sn` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '发动机号码',
  `certification_date` date DEFAULT NULL COMMENT '发证日期',
  `brand_model` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '品牌类型',
  `register_date` datetime DEFAULT NULL COMMENT '注册日期',
  `address` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '住址',
  `first_register_date` datetime DEFAULT NULL COMMENT '初次登记日期',
  `contact_number` varchar(20) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '联系电话',
  `manufacturer` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '生产厂商',
  `vehicle_license_mp` mediumblob COMMENT '行驶证主页',
  `vehicle_license_sp` mediumblob COMMENT '行驶证副页',
  `vehicle_list` mediumblob COMMENT '随车清单',
  `creator` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建人',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '修改人',
  `updated_time` datetime DEFAULT NULL,
  `registration_type` varchar(10) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '登记类型',
  `flag_internal` char(1) COLLATE utf8_unicode_ci NOT NULL DEFAULT '1' COMMENT '是否为场内车辆，1：是 0：否',
  `total_weight` varchar(50) COLLATE utf8_unicode_ci DEFAULT '' COMMENT '总质量',
  `curb_weight` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '整备质量',
  `approved_weight` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '核定载质量',
  `flag_delete` char(5) COLLATE utf8_unicode_ci DEFAULT '0' COMMENT '0-不删除 1-删除 2-其他',
  PRIMARY KEY (`vehicle_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='车辆基本信息表';

-- ----------------------------
-- View structure for car_summary
-- ----------------------------
DROP VIEW IF EXISTS `car_summary`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `car_summary` AS select `t`.`ab_id` AS `ab_id`,`t`.`ac_id` AS `ac_id`,`t`.`vehicle_plate` AS `vehicle_plate`,`t`.`vehicle_color` AS `vehicle_color`,`t`.`vehicle_type` AS `vehicle_type`,`t`.`stage` AS `stage`,`t`.`entry_time` AS `entry_time`,`t`.`out_time` AS `out_time`,`t`.`flag_forbidden` AS `flag_forbidden`,`t`.`flag_undercontrol` AS `flag_undercontrol`,`t`.`duration` AS `duration`,`t`.`direction` AS `direction`,`t`.`reason_forbidden` AS `reason_forbidden`,`t`.`remark` AS `remark` from `t_vehicle_access_record` `t` where (`t`.`vehicle_type` = '1') ;

-- ----------------------------
-- View structure for truck_summary
-- ----------------------------
DROP VIEW IF EXISTS `truck_summary`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `truck_summary` AS select `t`.`ab_id` AS `ab_id`,`t`.`ac_id` AS `ac_id`,`t`.`vehicle_plate` AS `vehicle_plate`,`t`.`vehicle_color` AS `vehicle_color`,`t`.`vehicle_type` AS `vehicle_type`,`t`.`stage` AS `stage`,`t`.`entry_time` AS `entry_time`,`t`.`out_time` AS `out_time`,`t`.`flag_forbidden` AS `flag_forbidden`,`t`.`flag_undercontrol` AS `flag_undercontrol`,`t`.`duration` AS `duration`,`t`.`direction` AS `direction`,`t`.`reason_forbidden` AS `reason_forbidden`,`t`.`remark` AS `remark` from `t_vehicle_access_record` `t` where (`t`.`vehicle_type` = '2') ;
