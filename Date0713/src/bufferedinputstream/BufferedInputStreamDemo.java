package bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("f:\\bos.txt"));
//
//        byte[] bys=new byte[1024];
//        int len=0;
//        while((len=bis.read(bys))!=-1)
//        {
//            System.out.println(new String(bys,0,len));
//        }
//        bis.close();
        FileInputStream fis=new FileInputStream("f:\\bos.txt");
        byte[] bys=new byte[1024];
        int len=0;
        while((len=fis.read(bys))!=-1)
        {
            System.out.println(new String(bys,0,len));
        }

    }
}
