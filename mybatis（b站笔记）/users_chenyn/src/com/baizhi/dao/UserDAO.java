
package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.User;

public interface UserDAO {
	
	//查询所有用户 同时也要查询用户的身份信息
	List<User> queryAll();
	
	//添加用户
	void add(User user);
	
	//查询没有身份的用户信息
	List<User> queryAllNoCard();
	
	//添加搜索功能
	List<User> queryByKeywords(User user);
	
}
