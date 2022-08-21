package dao;


import bean.Semester;

import java.sql.Connection;
import java.util.List;

/**
 * @author lrd
 * @date 2022-08-21 下午6:41
 */
public interface SemesterDao {
    List<Semester> getSemester();

    void saveSemester(Connection conn, Semester semester);//插入

    void deleteSemesterById(Connection conn, int cid);//删除

    Semester getSemesterById(Connection conn,int cid);//根据Id查

    void updateSemester(Connection conn,Semester semester);//更新信息
}
