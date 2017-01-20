public class Main {

    public static void main(String[] args) {
        People p = new People() {
            @Override
            public void eat() {
                System.out.println("普通人吃饭");
            }

            @Override
            public void drink() {
                System.out.println("普通人喝茶");
            }

            @Override
            public void sleep() {
                System.out.println("普通人睡床上");
            }
        };

        p.eat();
        p.drink();
        p.sleep();
    }
}
