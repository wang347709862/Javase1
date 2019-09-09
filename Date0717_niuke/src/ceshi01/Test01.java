package ceshi01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String numstr=br.readLine();
        char[] a=numstr.toCharArray();
//        byte[] b=numstr.getBytes();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+0+" ");
        }
//        for(int i=0;i<b.length;i++){
//            System.out.print(b[i]);
//        }
        Scanner sc = new Scanner(System.in);
        String [] c= new String[10];
        for (int j = 0; j <c.length ; j++) {
            c[j] = sc.next();
            char [] q =c[j].toCharArray();
            System.out.println(q[j]+0);
        }
    }
}
