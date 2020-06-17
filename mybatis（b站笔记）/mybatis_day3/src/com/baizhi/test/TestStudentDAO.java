package com.baizhi.test;

import java.util.List;

import com.baizhi.dao.StudentDAO;
import com.baizhi.entity.Course;
import com.baizhi.entity.Student;
import com.baizhi.util.MybatisUtil;

public class TestStudentDAO {

	public static void main(String[] args) {
		
		List<Student> list = MybatisUtil.getSqlSession().getMapper(StudentDAO.class).queryAll();
		for (Student student : list) {
			System.out.println(student);
			List<Course> courses = student.getCourses();
			for (Course course : courses) {
				System.out.println("课程:  "+course);
			}
			System.out.println("===============================================");
		}
		MybatisUtil.close();
		
	}

}
