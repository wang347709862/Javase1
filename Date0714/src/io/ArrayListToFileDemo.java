package io;

import java.io.*;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
//        ArrayList<String> array=new ArrayList<>();
//        array.add("王利杰");
//        array.add("陶勇");
//        array.add("伍向康");
//        array.add("佟鑫");
//
//        BufferedWriter bw=new BufferedWriter(new FileWriter("f:\\a.txt"));
//        for (String s : array) {
//            bw.write(s);
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
        ArrayList<String> array=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader("f:\\a.txt"));

        String line=null;
        while((line=br.readLine())!=null)
        {
            array.add(line);
        }
        br.close();
        int ran=(int)Math.round(Math.random()*3);
        System.out.println(array.get(ran));
    }
}
