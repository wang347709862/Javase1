package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TextDemo {
    public static void main(String[] args) throws IOException {
        OutputStream i=null;
        try {
            i=new FileOutputStream("f:\\aaa.txt",true);
            byte[] e={97,98,99};
            i.write(e,1,2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            i.close();
        }
    }
}
