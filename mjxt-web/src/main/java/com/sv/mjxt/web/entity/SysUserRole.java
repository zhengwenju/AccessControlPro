package com.sv.mjxt.web.entity;

public class SysUserRole  {

    private Long Id;
    /** 用户ID */
    private Long userId;

    /** 角色ID */
    private Long roleId;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
