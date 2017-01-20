import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 定义一个长度为10的整数数组，可用于保存用户通过控制台输入的10个整数，并计算它们的平均值，最大值，最小值
    public static void main(String[] args) throws IOException {
        System.out.println("请输入10个整数：");
        int[] ints = new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i<10; i++) {
            ints[i] = Integer.valueOf(r.readLine());
            sum += ints[i];
        }

        int min = ints[0];
        int max = ints[0];
        for(int i : ints) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        System.out.println("AVG - " + sum/10);
        System.out.println("MAX - " + max);
        System.out.println("MIN - " + min);
    }
}
