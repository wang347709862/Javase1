package collection1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c=new ArrayList();

        c.add("hello");
        c.add("world");
        c.add("java");
        Object[] o=c.toArray();
        for(int i=0;i<o.length;i++)
        {
            String s=(String)o[i];
            System.out.println(s);
        }
////        c.clear();
////        System.out.println(c.remove("hello"));
//        System.out.println(c.contains("hello"));
//        System.out.println(c.contains("world"));
//        System.out.println(c.toString());
//        Collection c1=new ArrayList();
//        c1.add("abc1");
//        c1.add("abc2");
//        c1.add("abc3");
//        c1.add("abc4");
//        Collection c2=new ArrayList();
//        c2.add("abc5");
//        c2.add("abc6");
//        c2.add("abc7");
//        c2.add("abc8");
//        c2.add("abc1");
//        c1.addAll(c2);
//        System.out.println(c1);
//        c1.removeAll(c2);
//        System.out.println(c1);

       ;
//        System.out.println( c1.containsAll(c2));
//        System.out.println(c1.retainAll(c2));
//        System.out.println(c1);
    }
}
