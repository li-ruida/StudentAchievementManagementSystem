package dao;


import bean.Classstu;

import java.sql.Connection;
import java.util.List;

/*
private int cid;
    private int sid;
    private int sgrad;

 */
public interface ClassStuDao {
    List<Classstu> getClassstu();

    void saveClassstu(Connection conn, Classstu classstu);//插入

    void deleteClassstuById(Connection conn, int cid,int sid);//删除

    Classstu getClassstuById(Connection conn,int cid,int sid);//根据Id查

    void updateClassstu(Connection conn,Classstu classstu);//更新信息
}

