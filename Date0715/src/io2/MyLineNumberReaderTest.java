package io2;

import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReaderTest {
    public static void main(String[] args) throws IOException {
        MyLineNumberReader mr=new MyLineNumberReader(new FileReader("f:\\a.txt"));

        mr.setLineNumber(10);
        String line=null;
        while((line=mr.readLine())!=null){
            System.out.println(mr.getLineNumber()+":"+line);
        }
    }
}
