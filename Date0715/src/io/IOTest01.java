package io;

import java.io.*;

public class IOTest01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("f:\\a.txt"));

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("f:\\b.txt")));

        String line=null;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
