package testall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array=new ArrayList<>();

        HashMap<String,String> hm1=new HashMap<>();
        hm1.put("周瑜", "小乔");
        hm1.put("吕布", "貂蝉");
        // 把元素添加到array里面
        array.add(hm1);

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        // 把元素添加到array里面
        array.add(hm2);

        // 创建元素1
        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        // 把元素添加到array里面
        array.add(hm3);

        for (HashMap<String, String> hm : array) {
            Set<String> keyset = hm.keySet();
            for (String s : keyset) {
                String value=hm.get(s);
                System.out.println(s+"\t"+value);
            }
        }
    }
}
