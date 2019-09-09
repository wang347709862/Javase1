package HashSet1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Random r=new Random();
        Set<Integer> s=new HashSet();
        while(s.size()<10)
        {
            int num=r.nextInt(20)+1;
            s.add(num);
        }
        for (Integer i : s) {
            System.out.println(i);
        }
    }
}
