package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.service.UserServiceImpl;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	
	private UserService userService = new UserServiceImpl();
	private List<User> users;
	private User user;
	private List<String> cols;//接收搜索的选中列
	private String keywords; //搜索条件  多个条件之间使用","隔开
	
	public List<String> getCols() {
		return cols;
	}
	public void setCols(List<String> cols) {
		this.cols = cols;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}



	//处理用户查询所有方法
	public String  findAll(){
		users = userService.findAll();
		return Action.SUCCESS;
	}
	//处理保存用户的方法
	public String add(){
		userService.add(user);
		return Action.SUCCESS;
	}
	//查询所有用户 (没有身份信息)
	public String findAllNoCard(){
		users = userService.findAllNoCard();
		return Action.SUCCESS;
	}
	//处理查询
	public String findByKeywords(){
		users = userService.findByKeywords(cols, keywords);
		return Action.SUCCESS;
	}
	
	

}
