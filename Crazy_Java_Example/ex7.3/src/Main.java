import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str = new String("A1B2C3D4E5F6G7H8");

        char[] chr = str.toCharArray();
        ArrayList<Character> digit = new ArrayList<>();
        ArrayList<Character> chrs = new ArrayList<>();

        for(char c : chr) {
            if(c>='0' && c<='9') {
                digit.add(c);
            } else if(c>='A' && c<= 'Z') {
                chrs.add(c);
            }
        }

        System.out.println(Arrays.toString(digit.toArray()));
        System.out.println(Arrays.toString(chrs.toArray()));
    }
}
