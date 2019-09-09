package test01;

public class Course {
    public Integer cid;
    public String cname;
    public Integer teach_id;

    public Course() {
    }

    public Course(Integer cid, String cname, Integer teach_id) {
        this.cid = cid;
        this.cname = cname;
        this.teach_id = teach_id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getTeach_id() {
        return teach_id;
    }

    public void setTeach_id(Integer teach_id) {
        this.teach_id = teach_id;
    }

    @Override
    public String toString() {

        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", teach_id=" + teach_id +
                '}';
    }
}
