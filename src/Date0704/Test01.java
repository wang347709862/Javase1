package Date0704;

import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        ToString t1=new ToString();
        ToString t2=new ToString();
        ToString t3=t2;
//        Scanner sc = new Scanner(System.in);
//        String s1=t1.toString();
//        System.out.println(s1);
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext())
//        {
//            int x=sc.nextInt();
//            System.out.println("x"+x);
//        }
//        System.out.println(t3.hashCode()+"\t"+t2.hashCode());
//        Integer in=new Integer("123");
//        System.out.println(in.toString());
//        int a = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
//        String a = sc2.nextLine();
//        int a2=(int)a;
//        Integer a2=new Integer(a);
        ;
//        String sc2 = sc2.nextLine();
        int a3=5;
        String s1=""+a3;
        String s2=Integer.toString(a3);

        String s3= new Integer(a3).toString();
        String s4=String.valueOf(a3);
        int i=Integer.parseInt(s1);
        System.out.println(s1+"\t"+s2+"\t"+s3+"\t"+s4);
//        String s1=Integer.parseInt(a3);
//        System.out.println("a:" +a2.doubleValue() + ",s2:" + s2);
       }}
