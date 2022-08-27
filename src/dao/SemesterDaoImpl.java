package dao;

import bean.Semester;

import java.sql.Connection;
import java.util.List;

/**
 * @author lrd
 * @date 2022-08-21 下午6:44
 */
public class SemesterDaoImpl extends BaseDao<Semester> implements SemesterDao{
    @Override
    public List<Semester> getSemester() {
        String sql="select * from semester";
        List beanList = BaseDao.getForList(Semester.class, sql);
        return beanList;
    }

    @Override
    public void saveSemester(Connection conn, Semester semester) {
        String sql="insert into semester VALUES (?,?,?)";
        BaseDao.update(conn,sql,semester.getCid(),semester.getScname(),semester.getSemid());
    }

    @Override
    public void deleteSemesterById(Connection conn, int cid) {
        String sql="delete from semester where cid = ? ";
        BaseDao.update(conn,sql,cid);
    }

    @Override
    public Semester getSemesterById(Connection conn, int cid) {
        String sql="select  * from semester where cid = ? ";
        return BaseDao.getInstance(Semester.class,sql,cid);
    }

    @Override
    public void updateSemester(Connection conn, Semester semester) {
        String sql="update semester set cid =? scname= ? semid=? where cid=?";
        BaseDao.update(conn,sql,semester.getCid(),semester.getScname(),semester.getSemid(),semester.getCid());
    }
}
