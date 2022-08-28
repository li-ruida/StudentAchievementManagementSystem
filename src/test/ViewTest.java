package test;

import bean.Semester;
import org.junit.Test;
import utils.JDBCCRUD;
import utils.JDBCUtils;

import java.sql.Connection;
import java.util.List;


public class ViewTest {
    @Test
    public void test1(){

        String sql="select distinct scname,semid from semester order by semid;";
        Connection connection= JDBCUtils.getConnection();
        List<Semester> forList = JDBCCRUD.getForList(Semester.class, sql);
        System.out.println(forList);
    }
}
