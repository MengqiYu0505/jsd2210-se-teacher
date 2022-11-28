package file;

import java.io.File;

/**
 * 访问一个目录中的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前项目目录下的所有子项
        File dir = new File(".");//"."就表示当前目录
        /*
            boolean isFile()
            判断当前File对象表示的是否为一个文件且存在

            boolean isDirectory()
            判断当前File对象表示的是否为一个目录且存在
         */
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println("当前项目目录下共:"+subs.length+"个子项");
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
