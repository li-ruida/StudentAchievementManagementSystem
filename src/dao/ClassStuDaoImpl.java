package dao;


import bean.Classstu;


import java.sql.Connection;
import java.util.List;

public class ClassStuDaoImpl extends BaseDao<Classstu> implements ClassStuDao{

    @Override
    public List<Classstu> getClassstu() {
        String sql="select * from classstu";
        List beanList = BaseDao.getForList(Classstu.class, sql);
        return beanList;
    }

    @Override
    public void saveClassstu(Connection conn, Classstu classstu) {
        String sql="insert into classstu VALUES (?,?,?,?,?,?,?)";
        BaseDao.update(conn,sql,classstu.getCid(),classstu, classstu.getSid(),classstu.getSgrad(),classstu.getCname(),classstu.getSemid(),classstu.getCredit(),classstu.getSname());
    }

    @Override
    public void deleteClassstuById(Connection conn, int cid, int sid) {
        String sql="delete from classstu where cid = ? sid=? ";
        BaseDao.update(conn,sql,cid,sid);
    }

    @Override
    public Classstu getClassstuById(Connection conn, int cid, int sid) {
        String sql="select *  from classstu where cid = ? sid=? ";
        return BaseDao.getInstance(Classstu.class,sql,cid,sid);
    }

    @Override
    public void updateClassstu(Connection conn, Classstu classstu) {
        String sql="update classstu set cid =? ,sid=? ,sgrad=? ,cname=? ,semid=? ,credit=? ,sname=? where sid=? and cid=?";
        BaseDao.update(conn,sql,classstu.getCid(),classstu.getSid(),classstu.getSgrad(),classstu.getCname(),classstu.getSemid(),classstu.getCredit(),classstu.getSname(),classstu.getSid(),classstu.getCid());
    }

}
