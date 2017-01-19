package person.teacher;

/**
 * 班主任类
 */
public class HeadTeacher extends Teacher {

    /**
     * @param name 班主任姓名
     */
    public HeadTeacher(String name) {
        super(name);
    }

    /**
     * @param name 班主任姓名
     * @param age 年龄
     * @param height 身高(CM)
     * @param weight 体重(KG)
     */
    public HeadTeacher(String name, int age, int height, double weight) {
        super(name, age, height, weight);
    }

    /**
     * 布置座位
     */
    public void seatingArrangement() {
        System.out.println(getName() + "布置座位");
    }
}
