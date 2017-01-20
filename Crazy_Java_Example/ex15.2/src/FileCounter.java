import java.io.File;

/**
 * 文件统计
 */
public class FileCounter {
    public static void counter(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println(path + "文件不存在");
            return;
        }

        if(file.isFile()) {
            System.out.println(file.getAbsolutePath());
            return;
        }

        File[] files = file.listFiles();
        if(files.length == 0) {
            System.out.println(file.getAbsolutePath());
            return;
        }

        int fileNum = 0;
        int dirNum = 0;
        for(File f : files) {
            if(f.isFile()) fileNum ++; else dirNum ++;
        }

        System.out.println(path + "里面有文件" + fileNum +"个，文件夹" + dirNum + "个");
    }
}
