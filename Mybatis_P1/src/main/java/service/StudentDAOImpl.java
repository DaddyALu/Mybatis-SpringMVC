package service;

import dao.StudentDAO;
import entity.Student;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtil;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public List<Student> findAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession(); //获取sqlSession
        StudentDAO studentDAO = sqlSession.getMapper(StudentDAO.class);
        List<Student> list = studentDAO.findAll();
        MybatisUtil.close();//关闭
        return list;
    }

    @Override
    public Student findID(String id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession(); //获取sqlSession
        StudentDAO studentDAO = sqlSession.getMapper(StudentDAO.class);
        Student student = studentDAO.findID(id);
        MybatisUtil.close();//关闭
        return student;
    }
}
