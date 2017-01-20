import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        HashSet<String> set = new HashSet<>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<20; i++) {
            String str = r.readLine();
            if(str.equals("") || str == null) {
                i--;
            } else {
                set.add(str);
            }
        }

        System.out.println(set.toString());
    }
}
