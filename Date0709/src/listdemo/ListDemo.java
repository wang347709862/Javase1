package listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add("hello");
        l1.add("world");
        l1.add("java");
        for(int i=0;i<l1.size();i++)
        {
            String s=(String)l1.get(i);
            System.out.println(s);
        }
        Iterator i=l1.iterator();
        while(i.hasNext())
        {
            String s=(String)i.next();
            System.out.println(s);
        }

//        System.out.println(l1.get(1))
// ;
//        l1.set(1,"wrong");
//        System.out.println(l1.remove(2));
//        l1.add(4,"android");
//        System.out.println(l1);
    }
}
