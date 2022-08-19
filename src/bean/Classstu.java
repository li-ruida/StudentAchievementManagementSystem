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

    public Classstu(int cid, int sid, int sgrad) {
        this.cid = cid;
        this.sid = sid;
        this.sgrad = sgrad;
    }

    public Classstu() {
    }

    @Override
    public String toString() {
        return "Classstu{" +
                "cid=" + cid +
                ", sid=" + sid +
                ", sgrad=" + sgrad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classstu classstu = (Classstu) o;
        return cid == classstu.cid && sid == classstu.sid && sgrad == classstu.sgrad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, sid, sgrad);
    }
}
