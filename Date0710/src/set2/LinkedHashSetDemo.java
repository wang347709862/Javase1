package set2;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> l1=new LinkedHashSet<>();
        l1.add("hello");
        l1.add("world");
        l1.add("java");
        l1.add("world");
        l1.add("java");

        for (String s : l1) {
            System.out.println(s);
        }
    }


}
