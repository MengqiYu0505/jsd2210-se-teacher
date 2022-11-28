package file;

import java.io.File;

/**
 * 新建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下新建一个名为demo的目录
//        File dir = new File("./demo");

        //创建一个f目录，f目录所在的位置如下
        File dir = new File("./a/b/c/d/e/f");
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else{
            /*
                make:做
                directory:目录
                将File对象表示的目录实际创建出来
             */
//            dir.mkdir();//该方法要求你创建的目录所在的目录必须存在，不存在不会报错，但是也不会进行任何创建了。
            dir.mkdirs();//该方法创建目录时会连同将所有不存在的父目录一同创建出来(推荐用这个方法)
            System.out.println("该目录已创建");
        }

    }
}
