package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将所有的小写字母写入文件fos.txt中
 */
public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        /*
            小写字母:a
            char c = 'a';    char c = 97;
            小写字母a是97.
            上面这句话的本意:
            整数97的2进制与ASC编码中'a'的2进制一样(01100001).
         */
        for(int i=0;i<26;i++) {
            fos.write(97+i);//将整数97的2进制"低八位"写入文件了.
        }
        System.out.println("写出完毕");
        fos.close();
    }
}
