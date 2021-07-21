package com.sv.mjxt.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sv.mjxt.web.entity.User;
@Mapper
public interface UserMapper {
    User login(String username);
    int add(User user);
    List<String> getRegion(String pid);
}
