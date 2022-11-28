package file;

import java.io.File;
import java.io.IOException;

/**
 * 在当前项目目录下创建10个文件，名字为test1.txt---test10.txt
 */
public class Test {
    public static void main(String[] args) throws IOException {
        for(int i=1;i<=10;i++){
            File file = new File("./test"+i+".txt");
            if(!file.exists()){
                file.createNewFile();
            }
        }
        System.out.println("完毕!");
    }
}
