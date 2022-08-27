package bean;

import java.util.Objects;

/**
 * @author lrd
 * @date 2022-08-21 下午6:39
 */
public class Semester {
    private int cid;
    private String scname;

    private int semid;

    public Semester(int cid, String scname, int semid) {
        this.cid = cid;
        this.scname = scname;
        this.semid = semid;
    }

    public int getSemid() {
        return semid;
    }

    public void setSemid(int semid) {
        this.semid = semid;
    }

    public Semester(int cid, String scname) {
        this.cid = cid;
        this.scname = scname;
    }

    public Semester() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    @Override
    public String toString() {
        return "Semester{" +
                "cid=" + cid +
                ", scname='" + scname + '\'' +
                ", semid=" + semid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Semester semester = (Semester) o;
        return cid == semester.cid && semid == semester.semid && Objects.equals(scname, semester.scname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, scname, semid);
    }
}
