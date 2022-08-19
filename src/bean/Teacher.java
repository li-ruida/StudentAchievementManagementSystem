package bean;

import java.util.Objects;
/**
 * @author lrd
 * @date 2022-08-17 上午9:29
 */
public class Teacher {
    private int tid;
    private String tname;
    private String tpassword;

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

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public Teacher() {
    }

    public Teacher(int tid, String tname, String tpassword) {
        this.tid = tid;
        this.tname = tname;
        this.tpassword = tpassword;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tpassword='" + tpassword + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return tid == teacher.tid && Objects.equals(tname, teacher.tname) && Objects.equals(tpassword, teacher.tpassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, tname, tpassword);
    }
}
