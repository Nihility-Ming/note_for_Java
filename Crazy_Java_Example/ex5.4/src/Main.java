public class Main {

    public static void main(String[] args) {

        PersonAction act = new PersonAction();
        StudentBaseInfo bi = new StudentBaseInfo("Weiming", 24, StudentBaseInfo.Gender.MALE);
        StudentDetailInfo di = new StudentDetailInfo("15918550637", "天神村", "tvlogin@qq.com");

        Student aStudent = new Student(bi, di, act);
        System.out.println(aStudent);
        aStudent.getAction().eat();
        aStudent.getAction().drink();
        aStudent.getAction().play();
        aStudent.getAction().sleep();
    }
}
