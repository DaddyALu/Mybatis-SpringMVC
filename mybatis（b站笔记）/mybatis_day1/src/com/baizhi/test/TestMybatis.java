package com.baizhi.test;

import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatis {
	public static void main(String[] args) throws Exception {
		
		
		//读取配置
		//InputStream is = TestMybatis.class.getResourceAsStream("/mybatis-config.xml");
		
		//Mybatis读取配置文件的方式
		//InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
		Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
		
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
		//获取连接  connection    -------->    sqlSession
		SqlSession session = sqlSessionFactory.openSession();
		
		System.out.println(session);
		session.getConnection().commit();
		
	}
}
