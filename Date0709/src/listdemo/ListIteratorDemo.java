package listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add("hello");
        l1.add("world");
        l1.add("java");

//        Iterator i1=l1.listIterator();
        Iterator i1=l1.listIterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
//            String s=(String)i1.next();
//            System.out.println(s);
        }
        System.out.println(((ListIterator) i1).previous());


    }
}
