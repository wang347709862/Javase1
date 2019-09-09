package test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> hm=new HashMap<>();

        ArrayList<String > array1=new ArrayList<>();
        array1.add("吕布");
        array1.add("周瑜");
        hm.put("三国演义", array1);

        // 创建元素集合2
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("令狐冲");
        array2.add("林平之");
        hm.put("笑傲江湖", array2);

        // 创建元素集合3
        ArrayList<String> array3 = new ArrayList<String>();
        array3.add("郭靖");
        array3.add("杨过");
        hm.put("神雕侠侣", array3);


        Set<String> hmset = hm.keySet();
        for (String hmkey : hmset) {
            System.out.println(hmkey);
            ArrayList<String> array=hm.get(hmkey);
            for (String s : array) {
                System.out.println(s+"\t");
            }
        }
    }
}
