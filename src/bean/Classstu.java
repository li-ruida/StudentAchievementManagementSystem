package bean;

import java.util.Objects;

/**
 * @author lrd
 * @date 2022-08-17 上午9:34
 */
public class Classstu {
    /*
    cid int NOT NULL,
    sid int NOT NULL,
    sgrad int NOT NULL default -1,
     */
    private int cid;
    private int sid;
    private int sgrad;
    private String cname;

    private int semid;
    private int credit;
    private String sname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Classstu(int cid, int sid, int sgrad, String cname, int semid, int credit, String sname) {
        this.cid = cid;
        this.sid = sid;
        this.sgrad = sgrad;
        this.cname = cname;
        this.semid = semid;
        this.credit = credit;
        this.sname = sname;
    }

    public Classstu(int cid, int sid, int sgrad, String cname, int semid, int credit) {
        this.cid = cid;
        this.sid = sid;
        this.sgrad = sgrad;
        this.cname = cname;
        this.semid = semid;
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classstu classstu = (Classstu) o;
        return cid == classstu.cid && sid == classstu.sid && sgrad == classstu.sgrad && semid == classstu.semid && credit == classstu.credit && Objects.equals(cname, classstu.cname) && Objects.equals(sname, classstu.sname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, sid, sgrad, cname, semid, credit, sname);
    }

    @Override
    public String toString() {
        return "Classstu{" +
                "cid=" + cid +
                ", sid=" + sid +
                ", sgrad=" + sgrad +
                ", cname='" + cname + '\'' +
                ", semid=" + semid +
                ", credit=" + credit +
                ", sname='" + sname + '\'' +
                '}';
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Classstu(int cid, int sid, int sgrad, String cname, int semid) {
        this.cid = cid;
        this.sid = sid;
        this.sgrad = sgrad;
        this.cname = cname;
        this.semid = semid;
    }

    public int getSemid() {
        return semid;
    }

    public void setSemid(int semid) {
        this.semid = semid;
    }

    public String getCname() {
        return cname;
    }

    public Classstu(int cid, int sid, int sgrad, String cname) {
        this.cid = cid;
        this.sid = sid;
        this.sgrad = sgrad;
        this.cname = cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Classstu(int cid, int sid, int sgrad) {
        this.cid = cid;
        this.sid = sid;
        this.sgrad = sgrad;
    }

    public Classstu() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSgrad() {
        return sgrad;
    }

    public void setSgrad(int sgrad) {
        this.sgrad = sgrad;
    }

}
