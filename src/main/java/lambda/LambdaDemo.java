package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK8之后推出了一个新特性:lambda表达式
 * lambda表达式的推出可以让我们编写java代码面向函数式。
 * lambda表达式直观感受：可以用更简洁的代码实现匿名内部类。
 * 注意:不是任何时候匿名内部类都可以换成lambda，【仅当实现的接口中只有一个抽象方法时可以使用】
 * 语法:
 * (参数列表)->{
 *     方法体
 * }
 *
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //文件过滤器的匿名内部类创建形式
        FileFilter filter1 = new FileFilter() {
            public boolean accept(File f) {
                return f.getName().endsWith(".txt");
            }
        };

        //lambda表达式写法
        FileFilter filter2 = (File f)->{
            return f.getName().endsWith(".txt");
        };

        //lambda表达式中参数的类型可以不写
        FileFilter filter3 = (f)->{
            return f.getName().endsWith(".txt");
        };

        //如果方法体只有一句代码，方法体的"{}"可以忽略不写，如果这句话含有return关键字那么也要一同忽略
        FileFilter filter4 = (f)->f.getName().endsWith(".txt");

        //如果方法的参数只有1个，那么"()"可以忽略不写
        FileFilter filter5 = f->f.getName().endsWith(".txt");

        //对比
        File dir = new File(".");
        //使用匿名内部类形式
//        File[] subs = dir.listFiles(new FileFilter() {
//            public boolean accept(File f) {
//                return f.getName().endsWith(".txt");
//            }
//        });

        //使用lambda表达式形式
        File[] subs = dir.listFiles(f->f.getName().endsWith(".txt"));


    }
}







