package io;

import java.io.*;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("f:\\a.txt"));
        String line=br.readLine();
        br.close();

        char[] chs=line.toCharArray();
        Arrays.sort(chs);
        String s=new String(chs);

        BufferedWriter bw=new BufferedWriter(new FileWriter("f:\\aaaaa.txt"));

        bw.write(s);
        bw.flush();
        bw.close();

    }
}
