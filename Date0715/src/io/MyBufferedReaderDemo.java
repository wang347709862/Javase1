package io;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        MyBufferedReader mr=new MyBufferedReader(new FileReader("f:\\a.txt"));

        String line=null;
        while((line=mr.readLine())!=null){
            System.out.println(line);
        }
        mr.close();
    }
}
