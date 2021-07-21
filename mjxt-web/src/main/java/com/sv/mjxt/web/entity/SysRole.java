package com.sv.mjxt.web.entity;

public class SysRole extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private long roleId;
    private String roleName;

    /** 角色权限 */
    private String roleCode;

    /** 角色排序 */
    private String roleSort;

    /** 数据范围 */
    private String dataScope;

    /** 角色状态 */

    private String status;

    /** 删除标志 */
    private String delFlag;

    /** 用户是否存在此角色标识 默认不存在 */
    private boolean flag = false;

    /** 菜单组 */
    private Long[] menuIds;

    /** 部门组（数据权限） */
    private Long[] deptIds;



}
