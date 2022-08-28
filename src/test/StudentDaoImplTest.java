package test;

import bean.Student;
import dao.StudentDao;
import dao.StudentDaoImpl;
import org.junit.Test;
import utils.JDBCUtils;

import java.sql.Connection;
import java.util.List;

public class StudentDaoImplTest {
    @Test
    public void getlist(){
        StudentDao studentDao=new StudentDaoImpl();
        List<Student> student = studentDao.getStudent();
        System.out.println(student);
    }
    @Test
    public void savestudent(){
        Connection connection= JDBCUtils.getConnection();
        StudentDao studentDao=new StudentDaoImpl();
        Student student = new Student(11111, "测试人名", "123456");
        studentDao.saveStudent(connection,student);
    }

    @Test
    public void deletestu(){
        Connection connection=JDBCUtils.getConnection();
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.deleteStudentById(connection,11111);
    }

    @Test
    public void getstu(){
        Connection connection=JDBCUtils.getConnection();
        StudentDao studentDao = new StudentDaoImpl();
        Student stu = studentDao.getStudentById(connection, 11111);
        System.out.println(stu);
    }
    @Test
    public void updatestu(){
        Connection connection=JDBCUtils.getConnection();
        StudentDao studentDao = new StudentDaoImpl();
        Student student = new Student(11111, "测试人名2", "123456");
        studentDao.updateStudent(connection,student);
    }


}
