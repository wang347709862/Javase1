package Date0620;

import java.util.*;
public class Date0620_3_nighttest {
    public static void main(String[] args){
//        int score=68;
//        String mark=(score>=60)?"及格":"不及格";
//        System.out.println("考试成绩："+mark);
//        chengfabiaoFanzhuan();
//        cut();
        int[] arr = {1,2,3,4,5};
        arrayDaoxu(arr);
        arrayBianli(arr);

//        int[] b=new int[5];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<5;i++)
//        {
//            a[i]=sc.nextInt();
//        }
//        Scanner sc2=new Scanner(System.in);//不创建新的录入变量会
        //沿用上个的
//        for(int i=0;i<5;i++)
//        {
//            b[i]=sc.nextInt();
//        }
//        arrayBianli(a);
//        arrayBianli(b);
//        byte a=12;byte b=34;int c=34;int d=34;
//        System.out.println(compare(c,d));//大的不能往小的里塞
//        System.out.println(compare(a,b));//可以吧byte赋值给int

    }
    public static void arrayDaoxu(int[] a){
        for(int start=0,end=a.length-1;start<=end;start++,end--)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        }
    }
    public static boolean compare(byte a,byte b) {
        return a == b;
    }
    public static boolean compare2(int a,int b) {
        return !(a == b);
    }
    public static void arrayBianli(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");
    }
    public static void chengfabiaoFanzhuan(){
        for(int i=9;i>0;i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
    public static void cut(){
        double length=3000;
        int day=0;
        while(length>=5)
        {
            day++;
            length/=2;
            System.out.println(length);
        }
        System.out.println("第"+day+"天短于5米");
    }
}
