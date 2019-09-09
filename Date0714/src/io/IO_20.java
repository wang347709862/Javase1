package io;

import java.io.*;

public class IO_20 {
    public static void main(String[] args) throws Exception {
//        OutputStreamWriter name = new OutputStreamWriter(new FileOutputStream(new File("d:\\a.txt")));
        InputStreamReader name2 = new InputStreamReader(new FileInputStream(new File("d:\\a.txt")),"GBK");
        char[] c=new char[1024];
        int len=0;
        while((len=name2.read(c))!=-1)
        {
            System.out.println(new String(c,0,len));
        }
//        name.write('a');
//        name.write(98);
//        name.flush();
//        char[] name2 = {'a', 'b', 'c'};
//        name.write(name2);
//        name.flush();
//        name.write("今天是个好日子");
//        name.write("今天是个好日子", 4, 7);
        name2.close();

    }}