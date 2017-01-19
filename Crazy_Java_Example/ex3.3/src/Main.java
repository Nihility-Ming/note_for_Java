public class Main {

    public static void main(String[] args) {

        // 低位向高位自动转换，完全没有问题
        int i = 1024;
        long l = i;
        System.out.println(l);

        // 高位向低位强制转换，没有超出低位范围，没有问题
        long l2 = 1024L;
        int i2 = (int)l2;
        System.out.println(i2);

        // 高位向低位强制转换，超出低位范围，有问题
        long l3 = 99999999999999L;
        int i3 = (int)l3;
        System.out.println(i3);
    }
}
