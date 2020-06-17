package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.User;

public interface UserService {
	
	//查询所有用户的业务方法
	public List<User> findAll();
	
	
	//添加用户的业务方法
	public void add(User user);
	
	//查询没有身份的用户
	public List<User> findAllNoCard();
	
	//搜索的功能
	public List<User> findByKeywords(List<String> cols,String keywords);
}
