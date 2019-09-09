package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args)throws IOException {
//        File file=new File("f:\\demo\\dsa.txt");
//        System.out.println(file.getName());
//        System.out.println(file.createNewFile());
//        File f1=new File("f:\\aaa\\bbb\\ccc");
//        System.out.println(f1.mkdirs());
        File file = new File("a.txt");
        System.out.println("createNewFile:" + file.createNewFile());

        File file2=new File("aaa\\bbb");
        System.out.println(file2.mkdirs());
        File file3=new File("aaa\\bbb");
        System.out.println(file.delete());
        System.out.println(file3.delete());


    }
}
