package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;import java.io.*;

public class IO_20 {
    public static void main(String[] args) throws Exception{
//
        OutputStreamWriter name = new OutputStreamWriter(new FileOutputStream(new File("f:\\f.txt")),"GBK");

//        InputStreamReader n = new InputStreamReader(new FileInputStream(new File("f:\\a.txt")),"GBK");
//        name.write('a');
//        name.write(98);
//        name.flush();
//        char[]  name2 = {'a','b','c'};
//        name.write(name2);
//        name.flush();
//        name.write("好日子");
        name.write("fa他为何");
        name.flush();
//        char[] e = new char[1024];
//        int a ;
//        while((a= n.read(e))!=-1){
//            System.out.println(new String(e,0,a)); }
//
//        n.close();
        name.close();



    }
}
