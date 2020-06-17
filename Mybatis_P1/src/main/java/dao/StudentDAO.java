package dao;


import entity.Student;

import java.util.List;

public interface StudentDAO {

    //查询所有学生
    public List<Student> findAll();

    //根据id查找学生
    public Student findID(String id);

}
