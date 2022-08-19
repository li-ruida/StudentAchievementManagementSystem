package test;

import org.junit.Test;
import utils.JDBCCRUD;
import utils.JDBCUtils;

import java.sql.Connection;


public class JDBCutilTest {
    @Test
    public void test1(){
        String sql="insert into student values(?,?,?)";
        JDBCCRUD.update(sql,10015,"李正","123456");

    }

}
