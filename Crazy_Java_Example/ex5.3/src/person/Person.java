package person;

/**
 * 普通人
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private double weight;
    private Person[] friends;

    public Person(String name) {
        this.name = name;
    }

    /**
     * 创建普通人
     * @param name 姓名
     * @param age 年龄
     * @param height 身高(CM)
     * @param weight 体重(KG)
     */
    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    /**
     * @param food 食物
     */
    public void eat(String food) {
        System.out.println(getName() + "正在吃" + food);
    }

    /**
     * @param drink 饮品
     */
    public void drink(String drink) {
        System.out.println(getName() + "正在饮" + drink);
    }

    /**
     * 睡觉
     */
    public void sleep() {
        System.out.println(getName() + "正在睡觉");
    }

    /**
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 年龄(岁)
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age 年龄(岁)
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return 身高(CM)
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height 身高(CM)
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return 体重(KG)
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight 体重(KG)
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return 好友
     */
    public Person[] getFriends() {
        return friends;
    }

    /**
     * 设置好友
     * @param friends 好友
     */
    public void setFriends(Person[] friends) {
        this.friends = friends;
    }
}
