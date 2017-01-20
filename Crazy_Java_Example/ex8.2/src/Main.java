import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i<10; i++) {
            String rndStr = "";
            for(int j = 0; j< 4; j++) {
                char c = (char)('a' + random.nextInt(26));
                rndStr += String.valueOf(c);
            }
            list.add(rndStr);
        }

        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list.get(random.nextInt(10)));
        System.out.println(list.get(random.nextInt(10)));
        list.remove(3);
        System.out.println(list);
    }
}
