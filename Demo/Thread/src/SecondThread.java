/**
 * 实现Runnable制作的线程类
 */
public class SecondThread implements Runnable {
    private int i;
    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void test() {
        for (int i = 0; i<100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 20) {
                new Thread(new SecondThread()).start();
                new Thread(new SecondThread()).start();
            }
        }
    }
}
