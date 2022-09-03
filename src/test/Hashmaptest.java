package test;

import bean.Student;
import org.junit.Test;
import utils.JDBCCRUD;
import utils.JDBCUtils;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;

public class Hashmaptest {
    @Test
    public void mapput(){
        String sql="select distinct  * from student;";
        Connection connection= JDBCUtils.getConnection();
        List<Student> studentmaplist = JDBCCRUD.getForList(Student.class, sql);
        System.out.println(studentmaplist);
        HashMap<Integer ,String> map=new HashMap();
        for(Student stu :studentmaplist){
            map.put(stu.getSid(),stu.getSname());
        }
        System.out.println(map);
    }
}
