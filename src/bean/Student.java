package bean;

import java.util.Objects;
/**
 * @author lrd
 * @date 2022-08-17 上午9:30
 */
public class Student {
    private int sid;
    private String sname;
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student() {
    }

    public Student(int sid, String sname, String password) {
        this.sid = sid;
        this.sname = sname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sstring='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid && Objects.equals(sname, student.sname) && Objects.equals(password, student.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, password);
    }
}
