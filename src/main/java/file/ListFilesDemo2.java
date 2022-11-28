package file;

import java.io.File;
import java.io.FileFilter;

/**
 * listFiles方法提供了一个重载，可以传入一个文件过滤器FileFilter
 * 该方法在获取一个目录中的子项时仅会将所有满足过滤器要求的子项返回。
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        //仅获取当前项目目录下的所有文本文件(文本文件的特点:文件名以".txt结尾")
        File dir = new File(".");
        if(dir.isDirectory()){//如果是一个目录
//            File[] subs = dir.listFiles();//获取目录中的所有子项

            //使用匿名内部类定义一个文件过滤器，该过滤器的接受条件:文件名以".txt"结尾
            FileFilter filter = new FileFilter() {
                /*
                    重写accept方法就是定义过滤器的接收条件。
                    重写原则:当参数file对象是该过滤器接收的元素方法应当返回true。否则返回false。
                 */
                public boolean accept(File file) {//accept:接受
                    String name = file.getName();//获取经过过滤器的元素file表示的文件名
                    return name.endsWith(".txt");//判断名字是否以".txt"结尾
                }
            };
            //返回目录中所有满足过滤器要求的子项
            File[] subs = dir.listFiles(filter);//listFiles方法内部会利用过滤器的accept方法将目录每个子项都经过一次过滤器

            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }


    }
}












