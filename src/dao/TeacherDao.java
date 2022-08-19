package dao;

import bean.Teacher;

import java.sql.Connection;
import java.util.List;

public interface TeacherDao {
    List<Teacher> getTeacher();

    void saveTeacher(Connection conn, Teacher teacher);//插入

    void deleteTeacherById(Connection conn, int tid);//删除

    Teacher getTeacherById(Connection conn,int tid);//根据Id查

    void updateTeacher(Connection conn,Teacher teacher);//更新信息
}
