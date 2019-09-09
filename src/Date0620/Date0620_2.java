package Date0620;

import java.util.Scanner;
public class Date0620_2 {
    public static void main(String[] arr){
        renyiSum();
    }
    public static void renyiSum(){
        Scanner sc=new Scanner(System.in);//任意个数字相加
        int sum=0;
        System.out.println("请输入若干个数字并以0结尾");
//        int temp;
        int count=0;
//        while(((temp=sc.nextInt())!=0))
//            sum+=temp;
        while(!sc.hasNext("0"))//输入不为0
        {
            sum+=sc.nextInt();
            count++;
        }
        System.out.println("这"+count+"个数的和是"+sum);
    }
}
