package test;

import bean.Student;
import dao.StudentDao;
import dao.StudentDaoImpl;
import org.junit.Test;

import java.util.List;

/**
 * @author lrd
 * @date 2022-08-22 下午3:13
 */
public class StudentDaoImplTest {
    @Test
    public void getlist(){
        StudentDao studentDao=new StudentDaoImpl();
        List<Student> student = studentDao.getStudent();
        System.out.println(student);
    }
}
