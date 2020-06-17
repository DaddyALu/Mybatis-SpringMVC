package com.baizhi.test;

import java.util.Date;
import java.util.List;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import com.baizhi.service.EmpServiceImpl;

public class TestEmpService {
	
	
	public static void main(String[] args) {
		
		EmpService empService  = new  EmpServiceImpl();
		List<Emp> findAll = empService.findAll();
		for (Emp emp : findAll) {
			System.out.println(emp);
		}
		
		empService.insert(new  Emp("3", "小明123", 23, new Date()));
		
		
		
		
		
	}
}
