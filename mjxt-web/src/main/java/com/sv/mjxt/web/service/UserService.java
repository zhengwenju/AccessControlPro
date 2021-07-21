package com.sv.mjxt.web.service;


import java.util.List;

import com.sv.mjxt.web.entity.User;

public interface UserService {

    User login(String username);
    List<String> getRegion(String pid);
    int add(User user);
}
