package com.sv.mjxt.web.service.impI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.mjxt.web.entity.User;
import com.sv.mjxt.web.mapper.UserMapper;
import com.sv.mjxt.web.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username) {

        return userMapper.login(username);
    }

    @Override
    public int add(User user) {

        return userMapper.add(user);
    }

	@Override
	public List<String> getRegion(String pid) {
		// TODO Auto-generated method stub
		return userMapper.getRegion(pid);
	}
}
