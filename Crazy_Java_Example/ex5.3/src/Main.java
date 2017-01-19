import build.School;
import person.Person;
import person.student.Student;
import person.teacher.HeadTeacher;
import person.teacher.Teacher;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("某人");
        p.eat("玉米");
        p.drink("奶");
        p.sleep();

        Student s1 = new Student("毕伟明", 24, 170, 55.5);
        Student s2 = new Student("刘航", 23, 175, 60.0);
        s1.exam();
        s2.exam();

        Teacher t = new Teacher("黄国华");
        t.teaching();

        HeadTeacher th = new HeadTeacher("刘志科");
        th.seatingArrangement();

        School s = new School("圆玄中学");
        s.setCount(1000);
        s.recruitStudents();
        s.classIsOver();

        s1.setSchool(s);
        s2.setSchool(s);
        t.setStudents(new Student[]{s1, s2});

        s1.setTeachers(new Teacher[]{t});
        s2.setTeachers(new Teacher[]{t});

        t.setSchool(s);

    }
}
