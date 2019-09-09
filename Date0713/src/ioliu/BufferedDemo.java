package ioliu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        read();
    }
    private static void read()throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("f:\\bos.txt"));
        String line = null;
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        float a=(float) 12.354;

    }
}
