package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SuanFa2 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int pre=0;
        int aft=1;
        int min=0;
        while(true){
            if(num>=pre & num<=aft){
                min=Math.min(num-pre,aft-num);
                break;
            }
            int temp=pre;
            pre=aft;
            aft=aft+temp;
        }
        System.out.println(min);
    }
}
