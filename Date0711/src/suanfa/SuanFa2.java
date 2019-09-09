package suanfa;

import java.util.Scanner;

public class SuanFa2 {
    public static void main(String[] args) {
//        题目：有n个人围成一圈，顺序排号。从第一个人开始
//        报数（从1到3报数），凡报到3的人退出圈子，问最
//        后留下的是原来第几号的那位。
        //数组
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入有多少人");
        int num=sc.nextInt();
        int[] people=new int[num];

        boolean[] isat=new boolean[num];
        for (boolean b : isat) {
            b=true;
        }

        while(true)
        {
            for(int i=0;i<num;i++)
            {
                if(isat[i]!=false)
                {

                }
            }
        }
    }
}
