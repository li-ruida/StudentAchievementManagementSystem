package bean;

import java.util.Objects;
/**
 * @author lrd
 * @date 2022-08-17 上午9:30
 */
public class Student {
    private int sid;
    private String sname;
    private String spassword;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public Student() {
    }

    public Student(int sid, String sname, String spassword) {
        this.sid = sid;
        this.sname = sname;
        this.spassword = spassword;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sstring='" + spassword + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid && Objects.equals(sname, student.sname) && Objects.equals(spassword, student.spassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, spassword);
    }
}
