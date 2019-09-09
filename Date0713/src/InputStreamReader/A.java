package InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("f:\\test\\.123.txt"),"ASCII");

//        osw.write(97);
//        InputStreamReader isr=new InputStreamReader(new FileInputStream("f:\\test\\.123.txt"),"GBK");
//        int len=0;
//        char[] bys=new char[1024];
//        while((len=isr.read(bys))!=-1)
//        {
//            System.out.println(new String(bys,0,len));
//        }
//
//        isr.close();
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("f:\\test\\.123.txt"));
//        FileOutputStream fos=new FileOutputStream("f:\\test\\.123.txt");
//        fos.write('a');
//        osw.write(97);
//        osw.write('我');
//        osw.close();;
//        char[] chs={'a','b','的'};
//        osw.write(chs,2,1);
        osw.write("我爱java");
        osw.close();
//        osw.write('a');
//        osw.write(97);
//        osw.write('我');
//        osw.close();;
    }
}
