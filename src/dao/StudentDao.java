package dao;

import bean.Student;

import java.sql.Connection;
import java.util.List;

public interface StudentDao {
    List<Student> getStudent();

    void saveStudent(Connection conn,Student student);//插入

    void deleteStudentById(Connection conn, int sid);//删除

    Student getStudentById(Connection conn,int sid);//根据Id查

    void updateStudent(Connection conn,Student student);//更新信息
}
