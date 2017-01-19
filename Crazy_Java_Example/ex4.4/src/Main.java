import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {

    // 实现一个按字节(一个中文字占两个字节)来截取字符串的子串方法。功能类似于String的subString实例方法
    private static String subString(String str, int beginIndex, int endIndex) throws UnsupportedEncodingException {
        byte bytes[] = str.getBytes("GBK");
        byte resultByte[] = new byte[endIndex-beginIndex];
        for(int i = beginIndex,j=0; i<endIndex; i++,j++) {
            resultByte[j] = bytes[i];
        }
        return new String(resultByte, "GBK");
    }

    public static void main(String[] args) throws Exception {
        System.out.println(subString("China你好中国", 2, 8));
        System.out.println("China你好中国".substring(2, 6));
    }
}
