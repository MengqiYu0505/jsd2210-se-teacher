package file;

import java.io.File;

/**
 * 删除一个目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前项目目录下的demo目录删除
//        File dir = new File("./demo");

        //a目录中含有内容，所以不能被直接删除
        File dir = new File("./a");
        if(dir.exists()){
            /*
                delete方法也会将File表示的目录删除
                注意:
                只有File表示的是一个空目录时才可以被删除！！
             */
            dir.delete();
            System.out.println("该目录已删除!");
        }else{
            System.out.println("该目录不存在!");
        }
    }
}
