package com.sv.mjxt.web.entity;

public class SysUserPostiton {
    private Long Id;
    /** 用户ID */
    private Long userId;

    /** 角色ID */
    private Long postId;

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

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
