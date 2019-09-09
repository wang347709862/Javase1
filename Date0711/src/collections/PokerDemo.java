package collections;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K" };

        for (String x : colors) {
            for (String y : numbers) {
                array.add(x+y);
//                System.out.println(x.concat(y));
            }
        }
        array.add("小王");
        array.add("大王");
        Collections.shuffle(array);
        ArrayList<String> fengQingYang = new ArrayList<String>();
        ArrayList<String> linQingXia = new ArrayList<String>();
        ArrayList<String> liuYi = new ArrayList<String>();
        ArrayList<String> diPai = new ArrayList<String>();

        for (int x=0;x<array.size();x++) {
            if(x>=array.size()-3)
            {
                diPai.add(array.get(x));
            }
            else if(x%3==0){
                fengQingYang.add(array.get(x));
            }
            else if(x%3==1){
                linQingXia.add(array.get(x));
            }
            else if(x%3==2){
                liuYi.add(array.get(x));
            }
        }

        lookPoker("风清扬",fengQingYang);
        lookPoker("林青霞", linQingXia);
        lookPoker("刘意", liuYi);
    }
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name+"的牌：");
        for (String s : array) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
