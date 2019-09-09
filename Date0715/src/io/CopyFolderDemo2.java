package io;

import java.io.*;

public class CopyFolderDemo2 {
    public static void main(String[] args) throws IOException {
        File srcFolder=new File("f:\\test");
        File destFolder=new File("f:\\test02");
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        File[] files=srcFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile() && name.endsWith(".txt");
            }
        });
        for (File file : files) {
            String name=file.getName();
//            System.out.println(name);//.123.txt
            File newFile=new File(destFolder,name);
            copyFile(file,newFile);
        }
        File[] dest=destFolder.listFiles();
        for (File file : dest) {
            String name=file.getName();
            String newName=name.replace(".java",".jad");
            File newFile=new File(destFolder,newName);
            file.renameTo(newFile);
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
