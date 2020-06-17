package test;

import dao.StudentDAO;
import entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.sql.SQLException;

public class TestMybatis {

    public static void main(String[] args) throws SQLException {

        //读取配置
        InputStream is = TestMybatis.class.getResourceAsStream("/mybatis-config.xml");
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //获取连接 sqlSession (相当于原来jdbc中的connection)
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //直接通过sqlSession获取DAO对象（接口.class）
        StudentDAO studentDAO = sqlSession.getMapper(StudentDAO.class);

        //调用方法
        Student student = studentDAO.findID("1");
        System.out.println(student);

        //测试连接的获取
//        System.out.println(sqlSession);


    }

}
