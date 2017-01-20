import java.io.*;
import java.nio.channels.FileChannel;

/**
 * 文件复制器
 */
public class FileDuplicator {
    public static boolean copy(String source, String target) throws IOException {
        File sourceFile = new File(source);
        if (!sourceFile.exists()) return false;

        File targetFile = new File(target);

        if (sourceFile.isDirectory()) {
            targetFile.mkdirs();
            File[] files = sourceFile.listFiles();
            for(File file : files) {
                copy(file.getAbsolutePath(), targetFile.getAbsolutePath() + "/" + file.getName());
            }
            return true;
        } else {
            FileChannel fileInputChannel = new FileInputStream(sourceFile).getChannel();
            FileChannel fileOutputChannel = new FileOutputStream(targetFile).getChannel();

            if(fileOutputChannel.transferFrom(fileInputChannel, 0, fileInputChannel.size()) > 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
