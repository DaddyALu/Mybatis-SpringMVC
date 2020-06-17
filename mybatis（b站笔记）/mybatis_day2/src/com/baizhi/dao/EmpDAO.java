package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.Emp;

public interface EmpDAO{
	
	public void insert(Emp emp);
	
	public void update(Emp emp);
	
	
	/**
	 * 
	 * @param pageNow   当前页
	 * @param pageSize  每页显示条数
	 * @return
	 */
	public List<Emp> selectByPage(@Param("pageNow")Integer pageNow,@Param("pageSize")Integer pageSize);	
	
	
	/**
	 * 模糊查询
	 * @param keyWords  搜索的关键字
	 * @return
	 */
	public List<Emp> selectByLike(String keyWords);
	
}
