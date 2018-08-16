package com.isoftstone.spring_boot_helloworld.app.user.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isoftstone.spring_boot_helloworld.app.user.bean.User;
import com.isoftstone.spring_boot_helloworld.app.user.mapper.UserMapper;
import com.isoftstone.spring_boot_helloworld.app.user.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	@Transactional
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	@Override
	public List<User> findList(User user) {
		return userMapper.findList(user);
	}

}
