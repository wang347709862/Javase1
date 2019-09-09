package arrastlisttest;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> a=new ArrayList<Integer>();
        int count=0;

        while(count<10)
        {
            int number=r.nextInt(20)+1;
            if(!a.contains(number))
            {
                count++;
                a.add(number);
            }
        }
        for(Integer i:a)
        {
            System.out.println(i);
        }
    }
}
