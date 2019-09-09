package io;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class IOTest1 {
    public static void main(String[] args) throws IOException {
        File f =new File("F:\\a.txt");
        f.createNewFile();
//        f.delete();

        byte[] b={1,2,3};
        InputStream i=new ByteInputStream();
        i.read(b);
        OutputStream o=new FileOutputStream(f) ;
//        o.write(12);
        byte[] b1={1,2,3};
        o.write(b);
        i.close();
        o.close();
    }
}
