package com.baizhi.test;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.util.MybatisUtil;

public class TestMybatisUtil {

	public static void main(String[] args) throws Exception {
		
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		System.out.println(sqlSession);
		sqlSession.getConnection().commit();
		
		
	}

}
