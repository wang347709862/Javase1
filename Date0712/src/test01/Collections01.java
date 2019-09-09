package test01;

import java.util.*;

public class Collections01 {
    public static void main(String[] args) {
        ArrayList<Integer> c=new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        Iterator x=c.listIterator();
        int num=0;
        while(x.hasNext())
        {

           ((ListIterator) x).add(5);
           x.next();
           num++;
           if(num>2)
           {System.out.println(((ListIterator) x).previous());
               break;}
        }
        System.out.println(c);
//        Object[] objects = c.toArray();
//        System.out.println(objects[0]);
//        Integer[] a=new Integer[4];
//        c.toArray(a);
//        System.out.println(a[0]);


    }
}
