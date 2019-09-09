package file;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {
    public static void main(String[] args) {
        File file=new File("f:\\");
        String[] strArray=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile() && name.endsWith(".bmp");
            }
        });
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
