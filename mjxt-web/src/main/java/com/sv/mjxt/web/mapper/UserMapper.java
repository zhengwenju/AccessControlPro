package com.sv.mjxt.web.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sv.mjxt.web.entity.User;
@Mapper
public interface UserMapper {
    User login(String username);
    int add(User user);
}
