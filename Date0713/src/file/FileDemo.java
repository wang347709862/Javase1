package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File srcFolder=new File("f:\\评书\\三国演义");
        File[] fileArray=srcFolder.listFiles();
        for (File file : fileArray) {
            String name=file.getName();

            int index=name.indexOf("_");
            String numberString=name.substring(index+1,index+4);

            int endIndex=name.lastIndexOf("_");
            String nameString=name.substring(endIndex);

            String newName=numberString.concat(nameString);
            File newFile=new File(srcFolder,newName);
            file.renameTo(newFile);
        }

    }
}
