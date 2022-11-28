package file;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个新的文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建一个文件:test.txt
        File file = new File("./test.txt");

        //由于abc目录不存在，创建时会抛出异常:java.io.IOException: 系统找不到指定的路径。
//        File file = new File("./abc/test.txt");
        /*
            boolean exists()
            判断当前File表示的路径下是否已经存在了对应的文件或目录
            如果已经存在则返回true。否则返回false。
         */
        if(file.exists()){
            System.out.println("该文件已存在!");
        }else{
            /*
                将file表的文件真实创建出来
                注意:如果要创建的文件所在的目录不存在，该方法会抛出异常。
             */
            file.createNewFile();//该方法要求处理异常:将光标停留在方法上按alt+回车:选第一项add exception...
            System.out.println("该文件已创建!");
        }


    }
}
