package setcollection;

import java.util.HashSet;
import java.util.Set;

public class SerDemo {
    public static void main(String[] args) {
        Set<String> s=new HashSet<String>();

        s.add("hello");
        s.add("java");
        s.add("world");
        s.add("java");
        s.add("world");
        for(String s2:s)
        {
            System.out.println(s2);
        }
//        for(String s2:s)
//        {
//            System.out.println(s2);
//        }
//        System.out.println("hello".hashCode());
//        System.out.println("hello".hashCode());
//        System.out.println("world".hashCode());
    }
}
