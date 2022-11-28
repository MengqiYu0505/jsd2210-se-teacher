package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JAVA IO
 * IO:Input和Output 即:输入与输出
 *
 * java将输入和输出用"流stream"表达.分为输入流与输出流.我们可以将它们想象为连接我们的程序与一个设备之间的"管道".通过它们可以读写设备.
 * java将输入流与输出流定义了两个对应的从超类
 * java.io.InputStream
 * 输入流,方向是从外界到程序的方向,用于读取数据的流.该类是一个抽象类,定义了读取字节的相关方法
 *
 * java.io.OutputStream
 * 输出流,方向是从程序到外界的方向,用于写出数据的流.该类是一个抽象类,定义了写出字节的相关方法
 *
 *
 * 文件流:
 * java.io.FileInputStream和FileOutputStream
 * 文件流继承自InputStream和OutputStream.是用于连接文件的"管道".可以对文件进行读写的流.
 *
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //向当前项目目录下的文件fos.dat中写入字节
        /*
            文件输出流两个常用的构造器:
            FileOutputStream(String filename)
            FileOutputStream(File file)
            文件流创建时如果指定的文件不存在会自动创建出来,前提是该文件所在的目录必须存在,否会会抛出异常.
            抛出的异常与File创建文件时相同情况抛出的异常一致.

            小知识:
            File与FileOutputStream都一样,在指定相对路径时,如果"./"不写,默认就表示当前目录
            即:"./fos.dat"等价于"fos.dat"
         */
//        File file = new File("fos.dat");
//        FileOutputStream fos = new FileOutputStream(file);

//        FileOutputStream fos = new FileOutputStream("./fos.dat");
        FileOutputStream fos = new FileOutputStream("fos.dat");
        /*
            OutputStream(所有字节输出流的超类)上定义了写出字节的相关方法:
            void write(int d)
            通过该输出流向目标位置写出1个字节,写出的是给定的int值对应的2进制的"低八位"

            当我们利用文件输出流写操作时:
            fos.write(1)
            向文件fos.dat中写入1个字节.

            int值1的2进制样子:00000000 00000000 00000000 00000001
                                                       ^^^^^^^^
                                                       写出该字节
            write后,fos.dat文件内容(文件长度1字节):
            00000001
         */
        fos.write(1);
        /*
            fos.write(2)
            向文件fos.dat中再写入1个字节.

            int值2的2进制样子:00000000 00000000 00000000 00000010
                                                       ^^^^^^^^
                                                       写出该字节
            write后,fos.dat文件内容(文件长度2字节):
            00000001 00000010
         */
        fos.write(2);

        System.out.println("写出完毕!");

        fos.close();//流用完了要关闭






    }
}










