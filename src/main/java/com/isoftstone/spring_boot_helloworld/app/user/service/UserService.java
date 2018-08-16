package com.isoftstone.spring_boot_helloworld.app.user.service;


import java.util.List;

import com.isoftstone.spring_boot_helloworld.app.user.bean.User;

public interface UserService {

	public void addUser(User user);

	public List<User> findList(User user);

}
