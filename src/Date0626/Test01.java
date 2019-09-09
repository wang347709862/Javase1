package Date0626;
import java.util.Scanner;
public class Test01 {
    public static void main(String[] args){
//        System.out.println(24 >> 2); //24 / 2^2 = 24 / 4 = 6
//        System.out.println(24 >>> 2);
//
//        System.out.println(-24 >> 2);
//        System.out.println(-24 >>> 2);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("请输入第一个数据：");
//        int x = sc.nextInt();
//
//        System.out.println("请输入第二个数据：");
//        int y = sc.nextInt();
//
//        //把键盘录入的数据进行相加即可
//        System.out.println("x.y:"+x+","+y);
//        int i=5;
//        int j=6;
//         i=(i>j)?i:j;
//        System.out.println(i);
//        int num=tuZI(7);
//        System.out.println(num);
        tuZI2(5);
    }
    public static int tuZI(int a){//输入月份，返回该月的兔子
        if(a==1 | a==2)
            return 1;
        int before=1;
        int next=1;
        for(int i=2;i<a;i++)
        {
            int temp=next;
            next+=before;
            before=temp;//before=next
        }
        return next;
    }
    public static void tuZI2(int a){//输入月份，返回1到该月的兔子
        if(a==1 )
            System.out.println(1);
        else if(a==2)
            System.out.println(1+"\t"+1);
//            return 1;
        else{
            System.out.print(1+"\t"+1);
            int before=1;
            int next=1;
            for(int i=2;i<a;i++)
            {
                int temp=next;
                next+=before;
                before=temp;//before=next
                System.out.print("\t"+next);
            }

        }

//        return next;
    }
}
