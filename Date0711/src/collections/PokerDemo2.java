package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class PokerDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//用于存放序号来洗牌
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


        HashMap<Integer, String> hm = new HashMap<>();
        int index = 0;
        for (String x : color) {
            for (String y : numbers) {
                hm.put(index, x.concat(y));//map存放序号---卡牌
                list.add(index);//list存放序号，方便洗牌，洗了相当于map也洗了
                index++;
            }
        }
        hm.put(index, "小王");
        list.add(index);
        index++;
        hm.put(index, "大王");
        list.add(index);
//        System.out.println(hm);
//        System.out.println(list);
        Collections.shuffle(list);//洗牌
//        System.out.println(list);

        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for(int x=0;x<list.size();x++)//发牌
        {
            if(x>=list.size()-3)
            {
                dipai.add(hm.get(list.get(x)));
            }
            else if(x%3==0)
            {
                player1.add(hm.get(list.get(x)));
            }
            else if(x%3==1)
            {
                player2.add(hm.get(list.get(x)));
            }
            else if(x%3==2)
            {
                player3.add(hm.get(list.get(x)));
            }
        }
        look(player1);
        look(player2);
        look(player3);
        look(dipai);

    }

    public static void look(ArrayList<String> array) {
        for (String s : array) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
