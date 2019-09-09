package listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add("hello");
        l1.add("world");
        l1.add("java");

//        Iterator i1=l1.listIterator();
//        while(i1.hasNext())
//        {
//            if(((String)i1.next()).equals("world"))
//            {
//                ((ListIterator) i1).add("javase");
//            }
//        }
        for(int x=0;x<l1.size();x++)
        {
            String s=(String)l1.get(x);
            if(s.equals("world"))
            {

                l1.add(x,"javase");
            }
        }
        System.out.println(l1);
    }
}
