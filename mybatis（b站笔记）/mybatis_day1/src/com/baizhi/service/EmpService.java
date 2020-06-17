package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Emp;

public interface EmpService {
	
	public List<Emp> findAll();
	
	
	public void insert(Emp emp);
 	
}
