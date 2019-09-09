package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
//        File file=new File("demo\\a.txt");
//        System.out.println("getAbsolutePath:" + file.getAbsolutePath());
//        System.out.println("getPath:" + file.getPath());
//        System.out.println("getName:" + file.getName());
//        System.out.println("length:" + file.length());
//        System.out.println("lastModified:" + file.lastModified());
//        System.out.println(f.isDirectory());
//        System.out.println("isFile:" + f.isFile());// true
//        System.out.println("exists:" + f.exists());
//        System.out.println("canRead:" + f.canRead());// true
//        System.out.println("canWrite:" + f.canWrite());// true
//        System.out.println("isHidden:" + f.isHidden());// false
//        f.createNewFile();
//        File f2=new File("f:\\林青霞.jpg");
//        System.out.println(f.renameTo(f2));

        Date d = new Date(1416471971031L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
    }
}
