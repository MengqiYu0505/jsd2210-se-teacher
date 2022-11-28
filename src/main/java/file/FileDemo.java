package file;

import java.io.File;

/**
 * io:input和output  输入与输出
 * java.io.File
 * 该类的每一个实例用于表示一个文件或目录。实际表示的是一个抽象路径。
 * 使用File可以:
 * 1:访问其表示的文件或目录的属性信息(名字，大小，权限等)
 * 2:创建/删除文件或目录
 * 3:访问一个目录中的子项信息
 *
 * File不能访问文件数据的
 */
public class FileDemo {
    public static void main(String[] args) {
        //绝对路径
//        File file = new File("C:/Users/X/Desktop/aaa/JSD2210/demo.txt");
        //相对路径，优点:有更好的跨平台性
        /*
            相对路径常用的有"./"当前目录,以及后期常用的类加载路径。
            "./"在IDEA执行程序时表达的时当前类所在的项目目录。这里就是JSD2210这个目录的位置。
         */
        File file = new File("./demo.txt");
        /*
            String getName()
            获取File表示的文件或目录的名字

            long length()
            获取File表示的文件或的长度
            若表达目录长度为0
            若表达的时文件则返回对应的字节数
         */
        String name = file.getName();
        System.out.println("name:"+name);

        long len = file.length();
        //输出0的情况:1.确实文件没有内容   2.file指定的路径不是实际对应的文件(路径无效)
        System.out.println("length:"+len);

        boolean ih = file.isHidden();//是否为隐藏的
        boolean cr = file.canRead();//是否可读
        boolean cw = file.canWrite();//是否可写
        System.out.println("是否隐藏:"+ih);
        System.out.println("是否可读:"+cr);
        System.out.println("是否可写:"+cw);

    }
}











