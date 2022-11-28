package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取当前目录下名字以"test"开始的子项
 */
public class Test2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                public boolean accept(File file) {
                    return file.getName().startsWith("test");
                }
            };
            File[] subs = dir.listFiles(filter);
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
