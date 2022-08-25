package bean;

import java.util.Objects;
/**
 * @author lrd
 * @date 2022-08-17 上午9:29
 */
public class Teacher {
    private int tid;
    private String tname;
    private String password;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Teacher() {
    }

    public Teacher(int tid, String tname, String password) {
        this.tid = tid;
        this.tname = tname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tpassword='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return tid == teacher.tid && Objects.equals(tname, teacher.tname) && Objects.equals(password, teacher.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, tname, password);
    }
}
