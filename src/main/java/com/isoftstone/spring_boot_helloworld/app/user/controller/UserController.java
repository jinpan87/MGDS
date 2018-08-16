package com.isoftstone.spring_boot_helloworld.app.user.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isoftstone.spring_boot_helloworld.app.user.bean.User;
import com.isoftstone.spring_boot_helloworld.app.user.service.UserService;

import net.sf.json.JSONArray;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("")
	public ModelAndView index(ModelAndView model) {
		List<User> list=new ArrayList<User>();
	    list=userService.findList(new User());
	    JSONArray jsonArray=JSONArray.fromObject(list);
	    model.addObject("jsonArray", jsonArray);
	    model.setViewName("userList");
		return model;
	}

	@RequestMapping("/user/add")
	public String addUser() {
		User user = new User();
		//user.setId(2);
		user.setName("李四");
		this.userService.addUser(user);
		return "添加用户成功!";
	}

}
