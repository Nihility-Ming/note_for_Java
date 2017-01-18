/**
 * 教室类
 */
public class Classroom {
    /**
     * 班级名
     */
    private String name;

    /**
     * 班级人数
     */
    private int count;

    /**
     * 学生
     */
    private Student[] students;

    /**
     * 任教老师
     */
    private Teacher[] teachers;

    /**
     * @param name 班级名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 班级名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return 获取所有的学生实例
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students 设置学生
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * @return 所有任教老师
     */
    public Teacher[] getTeachers() {
        return teachers;
    }

    /**
     * @param teachers 设置所有任教老师
     */
    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
