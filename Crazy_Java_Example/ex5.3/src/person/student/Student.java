package person.student;

import build.School;
import person.Person;
import person.teacher.Teacher;

/**
 * 学生类
 */
public class Student extends Person {
    private School school;
    private Teacher[] teachers;

    /**
     * @param name 学生姓名
     */
    public Student(String name) {
        super(name);
    }

    /**
     * @param name 学生姓名
     * @param age 年龄
     * @param height 身高(CM)
     * @param weight 体重(KG)
     */
    public Student(String name, int age, int height, double weight) {
        super(name, age, height, weight);
    }

    /**
     * 考试
     */
    public void exam() {
        System.out.println(getName() + "正在考试");
    }

    /**
     * @return 任教老师
     */
    public Teacher[] getTeachers() {
        return teachers;
    }

    /**
     * 设置任教老师
     * @param teachers 任教老师们
     */
    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
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
