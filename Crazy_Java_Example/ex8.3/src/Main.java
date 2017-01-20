import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] strs = new String[]{"a", "b", "a", "b", "c", "a", "b", "c", "b"};
        Map<String, Integer> map = new HashMap<>();

        for(String str : strs) {
            if(map.get(str) == null) {
                int num = 0;
                for(int i = 0; i<strs.length; i++) {
                    if(str.equals(strs[i])) {
                        num++;
                    }
                }
                map.put(str, num);
            }
        }

        System.out.println(map);
    }
}
