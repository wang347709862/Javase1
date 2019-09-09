package Date0701;

import java.math.*;
import java.util.Scanner;
public class SuanFa01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入想分解质因数的数字，0结束");
        int num=sc.nextInt();
        while(num!=0)
        {
            fenjieZhiyinshu(num);
            System.out.println("请输入想分解质因数的数字，0结束");
            num=sc.nextInt();
        }
    }
    public static void fenjieZhiyinshu(int num){
        System.out.print(num+"=");
        if(num==1)
        {
            System.out.print(1);
            return;
        }
        for(int i=2;i<=num;i++)
        {
            while(num%i==0 & i!=num)
            {
                System.out.print(i+"*");
                num/=i;
            }
        }
        System.out.println(num);

    }

}
