package com.isoftstone.spring_boot_helloworld.app.user.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.isoftstone.spring_boot_helloworld.app.user.bean.User;
@Mapper
public interface UserMapper {
	
	@Insert("insert into sys_user(id,name) values(#{id},#{name})")
	public void addUser(User user);

	
	
	@Select("select * from sys_user ")
	public List<User> findList(User user);
}
