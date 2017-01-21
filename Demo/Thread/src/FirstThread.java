/**
 * 通过继承Thread类来创建线程类
 */
public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void test() {
        for (int i = 0; i<100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 20) {
                new FirstThread().start();
                new FirstThread().start();
            }
        }
    }
}
