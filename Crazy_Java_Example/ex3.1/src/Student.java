/**
 * 学生类
 */
public class Student {

    private String name;
    private int height;
    private Gender gender;

    /**
     * @return 返回学生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 设置学生的姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 返回学生的身高(CM)
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height 设置学生的身高
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return 返回学生的性别
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender 设置学生的性别
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
