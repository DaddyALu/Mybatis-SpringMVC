package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.Book;

public interface BookDAO {
	
	
	
	public List<Book> selectAll();
	
	/**
	 * 用来测试动态sql if where
	 */
	public List<Book> selectByFields(Book book);
	
	/**
	 * 用来测试choose when otherwise
	 */
	public List<Book> selectByChoose(Book book);
	
	/**
	 * 用来测试set标签
	 * @param book
	 */
	public void update(Book book);
	
	/**
	 * 测试foreach 遍历
	 * @param books
	 */
	public void insertAll(List<Book> books);
	
	
	
	
}

