package digui;

import java.io.File;

public class FilePathDemo {
    public static void main(String[] args) {
        File file=new File("f:\\test");
        getAllTxtFilePaths(file);
    }
    public static void getAllTxtFilePaths(File srcFolder){
        File[] files=srcFolder.listFiles();
        for (File file : files) {
            if(file.isDirectory())
            {
                getAllTxtFilePaths(file);
            }
            else
            {
                String name=file.getAbsolutePath();
                if(name.endsWith(".txt"))
                         System.out.println(name);
            }

        }
    }
}
