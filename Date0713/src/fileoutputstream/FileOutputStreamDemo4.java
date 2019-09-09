package fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo4 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
//        try {
//            fos=new FileOutputStream("f:\\fos4.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            fos.write("java".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try{
            fos=new FileOutputStream("f:\\fos4.txt");
            fos.write("java".getBytes());
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        } finally{
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
