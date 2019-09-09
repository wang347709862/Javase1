package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add("hello");
        l1.add("world");
        l1.add("java");

        l1.addFirst("javaee");
        l1.addLast("android");
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1);
    }
}
