
package com.baizhi.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import com.baizhi.util.MybatisUtil;

public class TestEmpDAO {
	public static void main(String[] args) {

		SqlSession sqlSession = MybatisUtil.getSqlSession();
		EmpDAO mapper = sqlSession.getMapper(EmpDAO.class);
		//Emp emp = new  Emp("16",null, 24, new Date());
		/*mapper.insert(emp );*/
		
		//mapper.update(emp);//注意:修改时传递null 值就会修改为空
		
		
		/*List<Emp> selectByPage = mapper.selectByPage(3, 2);
		for (Emp emp : selectByPage) {
			System.out.println(emp);
		}*/
		
		List<Emp> selectByLike = mapper.selectByLike("黑");
		for (Emp emp : selectByLike) {
			System.out.println(emp);
		}
		
		
		MybatisUtil.commit();
	}

}
