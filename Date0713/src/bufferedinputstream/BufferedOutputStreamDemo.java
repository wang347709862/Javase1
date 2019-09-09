package bufferedinputstream;

import java.io.*;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
//        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("f:\\bos.txt"));
        method4("f:\\哥有老婆.mp4.txt", "f:\\copy4.mp4");
//        method1("f:\\哥有老婆.mp4.txt", "f:\\copy4.mp4");
//        method2("f:\\哥有老婆.mp4.txt", "f:\\copy4.mp4");
//        method3("f:\\哥有老婆.mp4.txt", "f:\\copy4.mp4");
//        bos.write("d的".getBytes());
//        bos.close();
    }

    public static void method1(String a, String b) throws IOException {
        FileInputStream fis = new FileInputStream(a);
        FileOutputStream fos = new FileOutputStream(b);

        int i = 0;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        fis.close();
        fos.close();
    }
    public static void method2(String a, String b) throws IOException {
        FileInputStream fis = new FileInputStream(a);
        FileOutputStream fos = new FileOutputStream(b);

        int len = 0;
        byte[] bys=new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }
    public static void method3(String a, String b) throws IOException {
//        FileInputStream fis = new FileInputStream(a);
//        FileOutputStream fos = new FileOutputStream(b);
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(a));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(b));

        int i = 0;
        while ((i = bis.read()) != -1) {
            bos.write(i);
        }
        bis.close();
        bos.close();
    }
    public static void method4(String a, String b) throws IOException {
//        FileInputStream fis = new FileInputStream(a);
//        FileOutputStream fos = new FileOutputStream(b);
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(a));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(b));


        int len = 0;
        byte[] bys=new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }

}
