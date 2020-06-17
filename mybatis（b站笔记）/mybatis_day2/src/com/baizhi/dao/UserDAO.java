package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.User;

public interface UserDAO {
	
	//查询用户  并且查询用户的身份信息
	public List<User> queryAll();
	
}
