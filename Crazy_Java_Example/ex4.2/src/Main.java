import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 循环输出等腰三角形
    public static void main(String[] args) throws IOException {

        while(true)
        {
            System.out.print("请输入一个整数: ");
            InputStreamReader r1 = new InputStreamReader(System.in);
            BufferedReader r2 = new BufferedReader(r1);
            Integer value = Integer.valueOf(r2.readLine());

            for(int line = 1; line<=value; line++) { // 控制行数
                for(int space = value-line; space>0; space--) { // 控制空格
                    System.out.print(' ');
                }

                for(int star = line*2-1; star!=0; star--) { // 控制星星个数
                    System.out.print('*');
                }

                System.out.print('\n');
            }

        }

    }
}
