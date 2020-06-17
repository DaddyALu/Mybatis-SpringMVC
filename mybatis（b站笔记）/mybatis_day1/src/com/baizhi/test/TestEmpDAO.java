package com.baizhi.test;

import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import com.baizhi.util.MybatisUtil;

public class TestEmpDAO {
	
	
	//测试根据id查询
	@Test
	public void testFindById() throws Exception {
		//读取配置文件
		Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		//创建sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
		//获取sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//直接通过sqlSession获取DAO对象 (接口.class)
		EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
		//调用方法
		Emp emp = empDAO.findById("1");
		System.out.println(emp);
	}
	//测试多参数查询
	@Test
	public void testFindByIdAndName() throws Exception{
		Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
		Emp emp = empDAO.findByIdAndName("1", "小黑");
		System.out.println(emp);
	}
	
	//测试查询所有
	
	@Test
	public void testFindAll() throws Exception{
		Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
		List<Emp> emps = empDAO.findAll();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
		sqlSession.close();
	}
	
	
	//测试更新
	@Test
	public void testUpdate() throws Exception{
		SqlSession sqlSession  = null;
		try {
			Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
			sqlSession= sqlSessionFactory.openSession();
			EmpDAO empDAO = sqlSession.getMapper(EmpDAO.class);
			empDAO.update(new Emp("1","小明", 23, new Date()));
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}
	
	//测试删除
	@Test
	public void testDelete(){
		SqlSession sqlSession = null;
		try {
			Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
			 sqlSession= sqlSessionFactory.openSession();
			EmpDAO mapper = sqlSession.getMapper(EmpDAO.class);
			mapper.delete("1");
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
		
	}
	
	
	//测试插入
		@Test
		public void testInsert(){
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			EmpDAO mapper = sqlSession.getMapper(EmpDAO.class);
			String id = UUID.randomUUID().toString();
			mapper.insert(new  Emp(id , "小豆豆", 24, new Date()));
			sqlSession.commit();
			MybatisUtil.close();
		}
	
	
}
