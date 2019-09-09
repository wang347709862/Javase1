package suanfa;

import java.util.Scanner;

public class SuanFa3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年，月，日，以空格隔开");
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();
        System.out.println("是"+year+"年的第"+date(year,month,day)+"天");
    }
    public static int date(int year,int month,int day){
        int[] a={0,31,28,31,30,31,30,31,31,30,31,30};
        int date=day;
        if((year%400==0)||(year%4==0 && year%100!=0))//是闰年
        {
            a[2]=29;
        }
        for(int i=0;i<month;i++)
        {
            date+=a[i];
        }
        return date;

    }
}
