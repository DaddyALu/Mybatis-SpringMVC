package com.baizhi.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import com.baizhi.util.MybatisUtil;

public class EmpServiceImpl implements EmpService {

	
	public List<Emp> findAll() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(); //获取sqlSession
		EmpDAO mapper = sqlSession.getMapper(EmpDAO.class);
		List<Emp> emps = mapper.findAll();
		MybatisUtil.close();//关闭
		return emps;
	}

	public void insert(Emp emp) {
		SqlSession sqlSession = null;
		try {
			sqlSession = MybatisUtil.getSqlSession();
			EmpDAO mapper = sqlSession.getMapper(EmpDAO.class);
			mapper.insert(emp);
			MybatisUtil.commit();//提交事务
		} catch (Exception e) {
			e.printStackTrace();
			MybatisUtil.rollback();//回滚事务
		}
		
	}
	
}
