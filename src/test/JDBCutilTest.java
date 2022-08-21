package test;

import org.junit.Test;
import utils.*;

public class JDBCutilTest {
    @Test
    public void test1() {
        String sql = "insert into student values(?,?,?)";
        JDBCCRUD.update(sql, 10019, "李正", "123456");
    }

}
