package Date0703_SuanFa;

import java.util.Scanner;

public class SuanFa {//两个正整数的最大公约数和最小公倍数

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int m=sc.nextInt();
        System.out.println("请输入第二个数");
        int n=sc.nextInt();
        System.out.print("这两个数的最大公约数是：");
        if(zuiDa(m,n)==-1)
        {
            System.out.println("不存在");
        }else
        {
            System.out.println(zuiDa(m,n));
        }//最大公约数可能不存在
        System.out.println("这两个数的最小公倍是："+zuiXiao(m,n));
    }
    public static int zuiXiao(int m,int n){
        int max=m>n?m:n;//存较大数
        for(int i=max;i<=m*n;i++)
        {
           if((i%m == 0)&(i%n==0))
           {
               return i;
           }
        }
        return 0;
    }

    public static int zuiDa(int m,int n){
        int min=m>n?n:m;//存较小数
        for(int i=min;i>=2;i--)
        {
            if((m%i == 0)&(n%i==0))
            {
                return i;
            }
        }
        return -1;
    }

}
