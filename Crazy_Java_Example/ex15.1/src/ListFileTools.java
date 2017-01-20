import java.io.File;

/**
 * 列出文件和子文件夹文件的工具
 */
public class ListFileTools {
    public static void list(String path) {
        File file = new File(path);
        if (file.exists()) {
            File[] fs = file.listFiles();
            if (fs.length > 0) {
                for (File f : fs) {
                    if (f.isDirectory()) {
                        list(f.getAbsolutePath());
                    }

                    System.out.println(f.getAbsolutePath());
                }
            } else {
                System.out.println(file.getAbsolutePath());
            }
        } else {
            System.out.println("找不到该路径: " + path);
        }
    }
}
