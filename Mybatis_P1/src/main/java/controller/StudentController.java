package controller;

import dao.StudentDAO;
import entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentDAOImpl;
import test.TestMybatis;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Controller /*要到springmvc配置文件中开启注解扫描，才能在工厂中创建这个对象*/
@RequestMapping("student") /* 加不加"/"都行 */
public class StudentController {

    StudentDAO studentDAO = new StudentDAOImpl();

    //开发第一个方法
//    @RequestMapping("findAll")
//    @ResponseBody
//    public Student hello(){
//        Student student = studentDAO.findID("1");
//        System.out.println(student);
//        return student;
//    }

    @RequestMapping("findAll")
    @ResponseBody
    public List<Student> findAll(){
        List<Student> list = studentDAO.findAll();
        for (Student student : list) {
            System.out.println(student);
        }
        return list;
    }

    @RequestMapping("findID")
    @ResponseBody
    public Student findID(){
        Student student = studentDAO.findID("1");
        System.out.println(student);
        return student;
    }

}
