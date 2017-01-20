/**
 * 人类行为
 */
public class PersonAction {
    public void eat() {
        System.out.println("吃东西");
    }

    public void drink() {
        System.out.println("喝东西");
    }

    public void play() {
        System.out.println("玩东西");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public String toString() {
        return "PersonAction{}";
    }
}
