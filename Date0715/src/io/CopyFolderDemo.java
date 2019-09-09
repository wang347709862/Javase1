package io;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder=new File("f:\\test");
        File destFolder=new File("f:\\test02");
        if(!destFolder.exists())
        {
            destFolder.mkdir();
        }

        File[] files=srcFolder.listFiles();
        for (File file : files) {
            String name=file.getName();
            File newFile=new File(destFolder,name);
            copyFile(file,newFile);
        }
    }
    private static void copyFile(File file,File newFile) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));

        int len=0;
        byte[] bys=new byte[1024];
        while((len=bis.read(bys))!=-1){
            bos.write(bys);
        }
        bis.close();
        bos.close();
    }
}
