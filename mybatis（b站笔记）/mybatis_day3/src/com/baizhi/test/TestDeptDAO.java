package com.baizhi.test;

import java.util.List;

import com.baizhi.dao.DeptDAO;
import com.baizhi.entity.Dept;
import com.baizhi.entity.Emp;
import com.baizhi.util.MybatisUtil;

public class TestDeptDAO {

	public static void main(String[] args) {
		
		List<Dept> list = MybatisUtil.getSqlSession().getMapper(DeptDAO.class).queryAll();
		
		for (Dept dept : list) {
			System.out.println(dept);
			List<Emp> emps = dept.getEmps();
			for (Emp emp : emps) {
				System.out.println(emp);
			}
			System.out.println("========================================================");
		}
		
	}

}
