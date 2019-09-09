package digui;

import java.io.File;
import java.util.Date;

public class FileDeleteDemo {
    public static void main(String[] args) {
        File srcFolder=new File("f:\\test");
        deleteFolder(srcFolder);
    }
    public static void deleteFolder(File srcFolder){
        File[] fileArray=srcFolder.listFiles();

        for (File file : fileArray) {
            if(file.isFile())
            {
                file.delete();
            }
            else
            {
                deleteFolder(file);
            }
        }
    }
}
