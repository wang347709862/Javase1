package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        int a=sc.nextInt();

        System.out.println(a);
        System.out.println(x);
//        while(sc.hasNextInt())
//        {int x=sc.nextInt();
//
//            if(x>5){
//                System.out.println("x:"+x);
//            }else
//            {
//                System.out.println("!!!");
//            }
//
//        }
    }
}
