package Date0704;

import java.util.Scanner;

public class SuanFa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");
        int m=sc.nextInt();
        System.out.println("请输入多少个数字相加：");
        int n=sc.nextInt();
        int result=sum(m,n);
        System.out.println("和为："+result);
    }
    public static int sum(int m,int n)
    {
        int result=0;
        int now=0;
        for(int i=0;i<n;i++)
        {
            now=now*10+m;
            result+=now;
        }
        return result;
    }
}
