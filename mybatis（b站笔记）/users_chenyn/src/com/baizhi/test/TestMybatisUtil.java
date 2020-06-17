package com.baizhi.test;

import java.sql.SQLException;

import com.baizhi.util.MybatisUtil;

public class TestMybatisUtil {
	public static void main(String[] args) throws Exception {
		
		MybatisUtil.getSqlSession().getConnection().commit();
		
	}

}
