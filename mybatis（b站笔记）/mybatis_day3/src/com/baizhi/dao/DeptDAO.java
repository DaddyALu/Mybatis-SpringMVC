package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.Dept;

public interface DeptDAO {
	
	//查询部门的同时将部门中所有的员工信息一并查到
	public List<Dept> queryAll();
	
}
