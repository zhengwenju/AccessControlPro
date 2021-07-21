package com.sv.mjxt.web.service;

import com.sv.mjxt.web.entity.User;

public interface UserService {

    User login(String username);
    int add(User user);
}
