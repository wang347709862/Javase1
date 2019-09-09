package io;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("f:\\fasf.txt"));
        bw.write("ddd飞的飞");
        bw.flush();
        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("f:\\fasf.txt"));

//        String line=null;
//        while((line=br.readLine())!=null)
//        {
//            System.out.println(line);
//        }
        char[] chs=new char[1024];
        int len=0;
        while((len=br.read(chs))!=-1)
        {
            System.out.println(new String(chs,0,len));
        }
        br.close();
    }
}
