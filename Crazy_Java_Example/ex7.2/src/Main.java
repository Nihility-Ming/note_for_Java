public class Main {

    public static void main(String[] args) {
        String str = "ABCDEFG";
        StringBuffer sb = new StringBuffer(str);
        String newStr = sb.substring(2, 4);
        String newStr2 = sb.substring(1, 2);
        String newStr3 = sb.substring(str.length()-2, str.length()-1);
        System.out.println(newStr3);
    }
}
