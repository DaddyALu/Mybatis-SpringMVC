package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.Emp;

public interface EmpDAO {

	//根据主键查询一个用户
	public Emp findById(String id);
	
	//多个参数的查询
	public Emp findByIdAndName(@Param("id")String id,@Param("name")String name);
	
	
	//查询所有
	public List<Emp> findAll();
	
	//更新员工
	public void update(Emp emp);
	
	//根据主键删除一个
	public void delete(String id);
	
	//插入
	public void insert(Emp emp);
	
	
}
