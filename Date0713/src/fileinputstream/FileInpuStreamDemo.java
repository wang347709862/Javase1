package fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInpuStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("f:\\fis2.txt");
        int i=0;
        while((i=fis.read())!=-1)
        {
            System.out.println ((char)i);
        }
//        FileOutputStream fos=new FileOutputStream("f:\\0.mp4");
//        String s="我爱你中国";
//        byte[] b=s.getBytes();
//        for (byte b1 : b) {
//            System.out.println(b1);
//        }
//        System.out.println(Arrays.toString(b));
//        int by=0;
//        while((by=fis.read())!=-1)
//        {
//            fos.write(by);
//        }
//        fis.close();fos.close();
//        int i=0;
//        while((i=fis.read())!=-1)
//        {
//            System.out.println((char)i);
//        }
//        fis.close();
//        byte[] bys=new byte[1024];
//        int len=0;
//        while((len=fis.read(bys))!=-1)
//        {
//            System.out.println(new String(bys,0,len));
//        }


//        System.out.println(len);
//        System.out.println(new String(bys));
//        System.out.println(new String(bys,2,1));
     }
}
