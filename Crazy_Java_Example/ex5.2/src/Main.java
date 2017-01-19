public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("毕伟明", 24, Student.Gender.MALE, "15918550637", "秀全街九潭村", "tvlogin@qq.com");
        Student s2 = new Student("局长", 34, Student.Gender.FEMALE, "15309999912", "地球村口泉社", "fff@qq.com");

        AddressBook ab = new AddressBook(new Student[]{s1, s2});
        Student searchResultStudent =  ab.searchWithName("毕伟明");
        if(searchResultStudent != null) {
            System.out.println(searchResultStudent.getName());
        }
    }
}
