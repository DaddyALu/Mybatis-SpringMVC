package com.baizhi.test;

import java.util.List;

import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import com.baizhi.util.MybatisUtil;

public class TestEmpDAO {

	public static void main(String[] args) {
		List<Emp> list = MybatisUtil.getSqlSession().getMapper(EmpDAO.class).queryAll();
		for (Emp emp : list) {
			System.out.println(emp+"   所属部门id:  "+emp.getDept().getId()+"  部门名称:  "+emp.getDept().getName());
		}
	}

}
