package com.baizhi.test;

import java.util.List;

import oracle.net.aso.s;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.util.MybatisUtil;

public class TestUserDAO {

	public static void main(String[] args) {
		
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		UserDAO mapper = sqlSession.getMapper(UserDAO.class);
		
		List<User> queryAll = mapper.queryAll();
		for (User user : queryAll) {
			System.out.println(user);
			System.out.println(user.getCard());
		}
		
	}

}
