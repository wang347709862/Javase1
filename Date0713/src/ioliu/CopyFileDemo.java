package ioliu;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream file=new FileInputStream("f:\\bos.txt");
//        FileOutputStream file2=new FileOutputStream("f:\\bbb.txt");


//        InputStreamReader fr=new InputStreamReader(new FileInputStream("f:\\bos.txt"),"GBK");
//        OutputStreamWriter fw=new OutputStreamWriter(new FileOutputStream("f:\\aaa.txt"),"GBK");
//        OutputStreamWriter fw=new OutputStreamWriter(new FileOutputStream("f:\\bos.txt"),"GBK");
//        fw.write("的订单 的的");
//        fw.close();;
        FileReader fr=new FileReader("f:\\bos.txt");
//        FileWriter fw=new FileWriter("f:\\bos.txt");
        int len=0;
//        fw.write("的打\r ");
//        fw.write("的的啊打\r ");
        char[] bys=new char[1024];
        while((len=fr.read(bys))!=-1)
        {
            System.out.println(new String(bys,0,len));
//            fw.write(bys,0,len);
//            fw.flush();
        }
        fr.close();
//        fw.close();


    }
}
