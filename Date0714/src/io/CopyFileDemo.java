package io;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("f:\\ddd.txt"),"GBK"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("f:\\ddd.txt"),"UTF-16"));

//        String line=null;
//        while((line=br.readLine())!=null){
//            System.out.println(line);
            bw.write("d返回");
//            bw.write(line);
            bw.flush();
            bw.close();
//        }
//        br.close();
//        bw.flush();
    }
}
