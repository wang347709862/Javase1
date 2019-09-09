package Date0705;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        String a="jtysjzfbcrt";
//        char[] c=a.toCharArray();
//        bubbleSort(c);
//        a=String.valueOf(c);
//        System.out.println(a);
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//       char [] c=str.toCharArray();
//        char[] copy=new char[c.length];
//        for(int i=0;i<c.length;i++)
//        {
//            copy[i]=c[c.length-1-i];
//        }
//        StringBuffer s1=new StringBuffer(str);
//        s1.reverse();
//        System.out.println(s1);
        int[] num1={1,2,3,4,5};
//        num1.notify();
//        System.out.print("{");
//        for(int i=0;i<num1.length;i++)
//        {
//            if(i!=num1.length-1)
//            {
//                System.out.print(num1[i]+",");
//            }
//            else
//            {
//                System.out.print(num1[i]);
//            }
//        }
//        System.out.print("}");
    }

    public static void bubbleSort(char[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void selectSort(char[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
