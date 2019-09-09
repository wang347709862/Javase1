package Date0623;
import java.util.*;
public class Date0623 {
    public static void main(String[] args) {
//            int i=5;
//            yanghuiSanjiao(i);
//        int mima=1234567;
//        jiami(mima);
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s=jiami2(num);
        System.out.println(s);
    }

    public static void yanghuiSanjiao(int num) {
        System.out.println("请输入想输出杨辉三角的行数（大于等于三）");
        int a[][] = new int[num][num];//不初始化不能参与运算
        a[0][0] = 1;
        a[1][0] = 1;
        a[1][1] = 1;
        for (int i = 2; i < num; i++) {
            a[i][0] = a[i][i] = 1;
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y <=x; y++) {
                System.out.print(a[x][y] + "\t");
            }
            System.out.println();
        }
    }
    public static void jiami(int mima){//八位以下的数字加密
        int num=1;
        for(int i=mima,j=1;(i/10)>0;j++){
            i/=10;
            num=j+1;
        }//for循环不会改变密码，while也可以，用另一个变量存一下
//        while((mima/10)>=1){
//            mima/=10;
//            num++;
//        }//取得密码的位数6
        System.out.println(num);
        System.out.println(mima);
        int[] a=new int[num];
        int temp;
        for(int i=num-1;i>=0;i--){
            a[i]=mima%10;
            mima/=10;
        }
//        System.out.println(a[5]);
//        System.out.println("密码是");
//        System.out.println(mima);
        for(int i=0;i<num/2;i++){
            temp=a[i];
            a[i]=a[num-i-1];
            a[num-i-1]=temp;
        }//倒序排列
        for(int i=0;i<num;i++)
            System.out.print(a[i]);//654321
        System.out.println();
        for(int i=0;i<num;i++)
        {
            a[i]=(a[i]+5)%10;
        }
        for(int i=0;i<num;i++)
            System.out.print(a[i]);
        System.out.println();//109876
        temp=a[0];a[0]=a[num-1];a[num-1]=temp;
        for(int i=0;i<num;i++)
            System.out.print(a[i]);//609871
    }
    public static String jiami2(int mima){//八位以下的数字加密改进
        int[] a=new int[8];
        int index=0;//存放位数
        while(mima>0){
            a[index]=mima%10;
            mima/=10;
            index++;
        }
        for(int i=0;i<index;i++){
            a[i]+=5;
            a[i]%=10;
        }
//        for(int i=0;i<index;i++)
//            System.out.print(a[i]);//2109876
        int temp=a[0];a[0]=a[index-1];a[index-1]=a[0];
        String s="";
        for(int i=0;i<index;i++){
            s+=a[i];
        }
        return s;
    }
}
