package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.Emp;

public interface EmpDAO {
	
	//查询员工信息的同时将员工的部门信息获取
	public List<Emp> queryAll();
	
}
