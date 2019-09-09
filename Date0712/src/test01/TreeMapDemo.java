package test01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        char[] chars = line.toCharArray();
        TreeMap<Character,Integer> tm=new TreeMap<>();

//
        for (char ch : chars) {
            Integer num=tm.get(ch);
            if(num==null){
                tm.put(ch,1);
            }
            else
            {
                num++;
                tm.put(ch,num);
            }
        }

        String buff="";

        Set<Character> tmset = tm.keySet();
        for (Character key : tmset) {
            Integer value=tm.get(key);
            System.out.print(buff+"("+key+")"+value+"\t");
        }
//        System.out.println();
    }
}
