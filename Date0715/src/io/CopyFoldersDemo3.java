package io;

import java.io.*;

public class CopyFoldersDemo3 {
    public static void main(String[] args) throws IOException {
        File srcFile=new File("f:\\test");
        File destFile=new File("f:\\test02");
        cpoyFolder(srcFile,destFile);

    }
    private static void cpoyFolder(File file ,File destFile)throws IOException{
        if(file.isDirectory()){
            File newFolder=new File(destFile,file.getName());
            newFolder.mkdir();
            File[] files=file.listFiles();
            for (File file1 : files) {
                cpoyFolder(file1,newFolder);
            }
        }
        else
        {
            File newFile=new File(destFile,file.getName());
            copyFile(file,newFile);
        }
    }
    private static void copyFile(File file,File newFile) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));

        byte[] bys=new byte[1024];
        int len=0;
        while((len=bis.read(bys))!=-1){
            bos.write(bys);
        }
        bis.close();;
        bos.close();
    }
}
