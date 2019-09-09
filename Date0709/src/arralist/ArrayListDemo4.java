package arralist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        while(true)
        {
            int next=sc.nextInt();
            if(next!=0)
            {
                a.add(next);
            }else
                break;
        }
        Integer[] i1=new Integer[a.size()];

        a.toArray(i1);
        Arrays.sort(i1);
        System.out.println(i1[i1.length-1]);

    }
}
