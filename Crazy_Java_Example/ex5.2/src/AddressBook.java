/**
 * 通讯录
 */
public class AddressBook {
    public AddressBook() {}

    public AddressBook(Student[] students) {
        this.students = students;
    }

    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student searchWithName(String name) {
        for(Student student : this.students) {
            if(student.getName().equals(name)) return student;
        }
        System.out.println("找不到该["+name+"]联系人");
        return null;
    }


    public Student searchWithEmail(String Email) {
        for(Student student : this.students) {
            if(student.getEmail().equals(Email)) return student;
        }
        System.out.println("找不到该["+Email+"]E-mail");
        return null;
    }

    public Student searchWithAddress(String address) {
        for(Student student : this.students) {
            if(student.getAddress().equals(address)) return student;
        }
        System.out.println("找不到该["+address+"]地址");
        return null;
    }
}
