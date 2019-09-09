package testall;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String,HashMap<String,Integer>> czbkMap=new HashMap<>();

        HashMap<String,Integer> jcMap=new HashMap<>();
        jcMap.put("陈玉楼", 20);
        jcMap.put("高跃", 22);
        // 把基础班添加到大集合
        czbkMap.put("jc", jcMap);

        // 创建就业班集合对象
        HashMap<String, Integer> jyMap = new HashMap<String, Integer>();
        // 添加元素
        jyMap.put("李杰", 21);
        jyMap.put("曹石磊", 23);
        // 把基础班添加到大集合
        czbkMap.put("jy", jyMap);

        Set<String> czbkset = czbkMap.keySet();
        for (String czbkkey : czbkset) {
            System.out.println(czbkkey);
            HashMap<String,Integer> hm=czbkMap.get(czbkkey);
            Set<String> hmset = hm.keySet();
            for (String hmkey : hmset) {
                Integer value=hm.get(hmkey);
                System.out.println(hmkey+"\t"+value);
            }
        }
    }
}
