package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] strs=br.readLine().split(" ");
        int[] a=new int[5];
        for (int i=0;i<5;i++) {
            a[i]=Integer.parseInt(strs[i]);
        }
    }
}
