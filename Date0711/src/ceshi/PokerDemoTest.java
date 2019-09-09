package ceshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class PokerDemoTest {
    public static void main(String[] args) {
        HashSet<String> array=new HashSet<>();
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for(String x:colors)
        {
            for (String y : numbers) {
                array.add(x.concat(y));//存入无序的hashset集合
            }
        }
        array.add("小王");
        array.add("大王");

        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

//        System.out.println(array);
//        for(int x=0;x<array.size();x++)
//        {
//            if(x>=array.size()-3)
//            {
//                dipai.add(array.)
//            }
//        }hashset迭代器只能用
        Iterator<String> i1=array.iterator();
        int count=0;
        while(i1.hasNext())
        {
            if(count>=array.size()-3)
            {
                dipai.add(i1.next());
            }
            else if(count%3==0)
            {
                player1.add(i1.next());
                count++;
            }
            else if(count%3==1)
            {
                player2.add(i1.next());
                count++;
            }
            else if(count%3==2)
            {
                player3.add(i1.next());
                count++;
            }
        }
//        Collections.shuffle(array);
        look(player1);
        look(player2);
        look(player3);
        look(dipai);
    }
    public static void look(ArrayList<String> array){
        for (String s : array) {
            System.out.print(s+" ");
        }
        System.out.println();

    }
}
