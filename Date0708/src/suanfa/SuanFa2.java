package suanfa;

import java.util.Scanner;

public class SuanFa2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] a=new int[5];
        int i=0;
        do{
            a[i]=num%10;
            num/=10;
            i++;
        }while(num!=0);
        System.out.println("这是"+i+"位数");
        for(int j=0;j<i;j++)
        {
            System.out.print(a[j]);
        }
    }
}
