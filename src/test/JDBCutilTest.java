package test;

import org.junit.Test;
import utils.JDBCCRUD;
import utils.JDBCUtils;

import java.sql.Connection;

/**
 * @author lrd
 * @date 2022-08-17 上午9:42
 */
public class JDBCutilTest {
    @Test
    public void test1(){
        String sql="insert into student values(?,?,?)";
        JDBCCRUD.update(sql,10015,"李正","123456");

    }

}
