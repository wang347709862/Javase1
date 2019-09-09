package set2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PX43 {
    public static void main(String[] args) {
//        无序
        PX19 d1 = new PX19("哈斯塔", 100000);
        PX19 d2 = new PX19("阿撒托斯", 100000);
        PX19 d3 = new PX19("克苏鲁", 100000);
        Set<PX19> a = new HashSet();

        a.add(d1);
        a.add(d2);
        a.add(d3);
        for (PX19 s : a) {
            System.out.println(s.toString());
        }

        System.out.println("=======================================");
//        升序排列
        Set<PX19> b = new TreeSet();

        b.add(d1);
        b.add(d2);
        b.add(d3);

        for (PX19 v : b) {
            System.out.println(v.toString());
        }
    }}