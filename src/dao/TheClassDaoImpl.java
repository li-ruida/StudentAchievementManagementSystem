package dao;


import bean.TheClass;

import java.sql.Connection;
import java.util.List;

public class TheClassDaoImpl extends BaseDao<TheClass> implements TheClassDao{
    @Override
    public List<TheClass> getTeacher() {
        String sql="select * from class";
        List beanList = BaseDao.getForList(TheClass.class, sql);
        return beanList;
    }

    @Override
    public void saveTheClass(Connection conn, TheClass theclass) {
        String sql="insert into class VALUES (?,?,?,?)";
        BaseDao.update(conn,sql,theclass.getCid(),theclass.getCname(),theclass.getTid(),theclass.getCredit());
    }

    @Override
    public void deleteTheClassById(Connection conn, int cid) {
        String sql="delete from class where cid = ?";
        BaseDao.update(conn,sql,cid);
    }

    @Override
    public TheClass getTheClassById(Connection conn, int cid) {
        String sql="select  * from class where cid = ?";
        return BaseDao.getInstance(TheClass.class,sql,cid);
    }

    @Override
    public void updateTheClass(Connection conn, TheClass theclass) {
        String sql="update class set cid=? cname=? tid=? credit=? where tid=?";
        BaseDao.update(conn,sql,theclass.getCid(),theclass.getCname(),theclass.getTid(),theclass.getCredit(),theclass.getTid());
    }
}
