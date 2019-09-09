package io;

import org.omg.CORBA.portable.InputStream;

import java.io.*;

public class IOTest02 {
    public static void main(String[] args) throws Exception{
        File f1=new File("f:\\a.txt");
//        InputStream in=new FileInputStream(f1);
//        int b=0;
//        while((b=in.read())!=-1){
//            System.out.println((char)b);
//        }

        InputStreamReader isr=new InputStreamReader(new FileInputStream(f1));
        int i1=0;
        while((i1=isr.read())!=-1)
        {
//            System.out.println(char(i1));
        }
        isr.close();
//        InputStreamReader fr= null;
//        try {
//            try {
//                fr = new InputStreamReader(new FileInputStream(f1),"GBK" );
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        BufferedReader br=new BufferedReader(fr);
//
//        try {
//
//            String s=br.readLine();
//
//            System.out.println(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }
}
