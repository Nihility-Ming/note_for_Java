public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("小东");
        student.setGender(Student.Gender.MALE);

        student.play();
        student.drink();
        student.eat();
        student.sleep();
    }
}
