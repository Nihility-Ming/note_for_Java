package person.teacher;

import build.School;
import person.Person;
import person.student.Student;

/**
 * 教师类
 */
public class Teacher extends Person {
    private School school;
    private Student[] students;

    /**
     * @param name 老师姓名
     */
    public Teacher(String name) {
        super(name);
    }

    /**
     * @param name 老师姓名
     * @param age 年龄
     * @param height 身高(CM)
     * @param weight 体重(KG)
     */
    public Teacher(String name, int age, int height, double weight) {
        super(name, age, height, weight);
    }

    /**
     * 教书中
     */
    public void teaching() {
        System.out.println(getName() + "正在教书");
    }

    /**
     * @return 学生
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * 设置教育的学生
     * @param students 学生
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * @return 所在学校
     */
    public School getSchool() {
        return school;
    }

    /**
     * 设置所在学校
     * @param school 所在学校
     */
    public void setSchool(School school) {
        this.school = school;
    }
}
