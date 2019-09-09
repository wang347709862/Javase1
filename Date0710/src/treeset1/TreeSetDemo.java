package treeset1;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(20);
        t.add(18);
        t.add(23);
        t.add(22);
        t.add(17);
        t.add(24);
        t.add(19);
        t.add(18);
        t.add(24);
        String s = "10";
//        System.out.println(Integer.valueOf(s));;
//        System.out.println(Integer.parseInt(s));;
        for (Integer i : t) {
            System.out.println(i);
//        }
        }


    }
}