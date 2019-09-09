package fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("f:\\fos2.txt",true);
//        System.out.println("hello,IO".getBytes());
        byte[] b="new!!!\r".getBytes();
        byte[] b2="\nnew2222!!!".getBytes();

        fos.write(b2);
//        fos.write(b,2,1);
        fos.close();
//        for (byte b1 : b) {
//            System.out.println(b1);
//        }
//        fos.write("hello,IO".getBytes());
//        fos.write("java".getBytes());
//        fos.close();
//        byte[] bys={97,98}

    }
}
