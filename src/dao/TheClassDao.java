package dao;


import bean.TheClass;

import java.sql.Connection;
import java.util.List;


public interface TheClassDao {
    List<TheClass> getTeacher();

    void saveTheClass(Connection conn, TheClass theclass);//插入

    void deleteTheClassById(Connection conn, int cid);//删除

    TheClass getTheClassById(Connection conn,int cid);//根据Id查

    void updateTheClass(Connection conn,TheClass theclass);//更新信息
}
