package dao;

import bean.Teacher;

import java.sql.Connection;
import java.util.List;


public class TeacherDaoImpl extends BaseDao<Teacher> implements TeacherDao{

    @Override
    public List<Teacher> getTeacher() {
        String sql="select * from teacher";
        List beanList = BaseDao.getForList(Teacher.class, sql);
        return beanList;
    }

    @Override
    public void saveTeacher(Connection conn, Teacher teacher) {
        String sql="insert into teacher VALUES (?,?,?)";
        BaseDao.update(conn,sql,teacher.getTid(),teacher.getTname(),teacher.getTpassword());
    }

    @Override
    public void deleteTeacherById(Connection conn, int tid) {
        String sql="delete from teacher where tid = ?";
        BaseDao.update(conn,sql,tid);
    }

    @Override
    public Teacher getTeacherById(Connection conn, int tid) {
        String sql="select from teacher where tid = ?";
        return BaseDao.getInstance(Teacher.class,sql,tid);
    }

    @Override
    public void updateTeacher(Connection conn, Teacher teacher) {
        String sql="update teacher set tid=? tname=? password=? where tid=?";
        BaseDao.update(conn,sql,teacher.getTid(),teacher.getTname(),teacher.getTpassword(),teacher.getTid());
    }
}
