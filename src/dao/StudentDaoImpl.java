package dao;


import bean.Student;

import java.sql.Connection;
import java.util.List;

public class StudentDaoImpl extends BaseDao<Student> implements StudentDao{

    @Override
    public List<Student> getStudent() {
        String sql="select * from student";
        List beanList = BaseDao.getForList(Student.class, sql);
        return beanList;
    }

    @Override
    public void saveStudent(Connection conn, Student student) {
        String sql="insert into student VALUES (?,?,?)";
        BaseDao.update(conn,sql,student.getSid(),student.getSname(),student.getSpassword());
    }

    @Override
    public void deleteStudentById(Connection conn, int sid) {
        String sql="delete from student where sid = ?";
        BaseDao.update(conn,sql,sid);
    }

    @Override
    public Student getStudentById(Connection conn, int sid) {
        String sql="select from student where sid = ?";
        return BaseDao.getInstance(Student.class,sql,sid);
    }

    @Override
    public void updateStudent(Connection conn, Student student) {
        String sql="update student set sid=? sname=? password=? where sid=?";
        BaseDao.update(conn,sql,student.getSid(),student.getSname(),student.getSpassword(),student.getSid());
    }
}
