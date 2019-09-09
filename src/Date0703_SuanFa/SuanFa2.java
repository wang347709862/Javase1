package Date0703_SuanFa;

import java.util.Scanner;

public class SuanFa2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int m=sc.nextInt();
        System.out.println("请输入第二个数");
        int n=sc.nextInt();
        int zuiDa=1;
        int zuiXiao=m*n;
        int temp;
        if(m<n)
        {
            temp=m;
            m=n;
            n=temp;
        }//m>n
        while(n!=0){//辗转相除
            temp=m%n;
            m=n;
            n=temp;
        }
        zuiDa=m;
        zuiXiao/=zuiDa;
        System.out.print("这两个数的最大公约数是："+zuiDa);
        System.out.println("这两个数的最小公倍是："+zuiXiao);
    }
}
