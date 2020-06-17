package com.baizhi.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.baizhi.dao.BookDAO;
import com.baizhi.entity.Book;
import com.baizhi.util.MybatisUtil;

public class TestBookDAO {
	
	@Test
	public void  testSelectAll(){
		
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		BookDAO mapper = sqlSession.getMapper(BookDAO.class);
		List<Book> selectAll = mapper.selectAll();
		for (Book book : selectAll) {
			System.out.println(book);
		}
		
		MybatisUtil.close();
		
	}
	
	@Test
	public void  testSelectFileds(){
		
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		BookDAO mapper = sqlSession.getMapper(BookDAO.class);
		List<Book> selectByFields = mapper.selectByFields(new Book(null, null,null, null,"小黑"));
		
		for (Book book : selectByFields) {
			System.out.println(book);
		}
		
		MybatisUtil.close();
		
	}
	
	@Test
	public void  testSelectByChoose(){

		SqlSession sqlSession = MybatisUtil.getSqlSession();
		BookDAO mapper = sqlSession.getMapper(BookDAO.class);
		List<Book> selectByChoose = mapper.selectByChoose(new Book(null,"六脉神剑", null, 123.0, "小黑"));
		for (Book book : selectByChoose) {
			System.out.println(book);
		}
		MybatisUtil.close();
		
	}
	
	
	@Test
	public void  testUpdate(){

		SqlSession sqlSession = MybatisUtil.getSqlSession();
		BookDAO mapper = sqlSession.getMapper(BookDAO.class);
		mapper.update(new Book("1", "六脉123", null, null, null));
		MybatisUtil.commit();
		
	}

	@Test
	public void  testInsertAll(){

		SqlSession sqlSession = MybatisUtil.getSqlSession();
		BookDAO mapper = sqlSession.getMapper(BookDAO.class);
		mapper.insertAll(Arrays.asList(new Book(UUID.randomUUID().toString(), "我的大学", new Date(), null, "高尔基")
						,new Book(UUID.randomUUID().toString(), "我的大学-1", new Date(), null, "高尔基-1")));	
		MybatisUtil.commit();
		
	}
	
	
	
	
	
	
	

}
