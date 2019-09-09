package test1;

import java.util.ArrayList;

public class Test0 {
    public static void main(String[] args) {
        int[] a=new int[10];
        ArrayList a1=new ArrayList();
        for(int i=0;i<10;i++)
        {
            int ran=(int)(Math.round(Math.random()*100));
            a[i]=ran;
            if(ran>=10)
                a1.add(ran);
        }
        for(int j=0;j<a1.size();j++)
        {
            System.out.println(a1.get(j));
        }
    }
}
