package bean;

import java.util.Objects;
/**
 * @author lrd
 * @date 2022-08-17 上午9:32
 */
public class TheClass {
    private int cid;
    private String cname;
    private int tid;
    private int credit;

    @Override
    public String toString() {
        return "TheClass{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", tid=" + tid +
                ", credit=" + credit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheClass theClass = (TheClass) o;
        return cid == theClass.cid && tid == theClass.tid && credit == theClass.credit && Objects.equals(cname, theClass.cname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, cname, tid, credit);
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public TheClass(int cid, String cname, int tid, int credit) {
        this.cid = cid;
        this.cname = cname;
        this.tid = tid;
        this.credit = credit;
    }

    public TheClass() {
    }

    public TheClass(int cid, String cname, int tid) {
        this.cid = cid;
        this.cname = cname;
        this.tid = tid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

}
