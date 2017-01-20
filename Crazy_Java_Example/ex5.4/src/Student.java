/**
 * 学生类
 */
public class Student {
    private StudentBaseInfo baseInfo;
    private StudentDetailInfo detailInfo;
    private PersonAction action;

    public Student() {
    }

    public Student(StudentBaseInfo baseInfo, StudentDetailInfo detailInfo, PersonAction action) {
        this.baseInfo = baseInfo;
        this.detailInfo = detailInfo;
        this.action = action;
    }

    public StudentBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(StudentBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public StudentDetailInfo getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(StudentDetailInfo detailInfo) {
        this.detailInfo = detailInfo;
    }

    public PersonAction getAction() {
        return action;
    }

    public void setAction(PersonAction action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Student{" +
                "baseInfo=" + baseInfo +
                ", detailInfo=" + detailInfo +
                ", action=" + action +
                '}';
    }
}
