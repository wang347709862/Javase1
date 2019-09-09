package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("杨康", "穆念慈");
        map.put("陈玄风", "梅超风");

//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            String value=map.get(key);
//            System.out.println(key+"\t"+value);
//        }
//        Iterator<String> i1=keys.iterator();
//        while(i1.hasNext())
//        {
//            String key=i1.next();
//            String values=map.get(key);
//            System.out.println(key+"\t"+values);
//        }

//        Set<Map.Entry<String,String>> set=map.entrySet();
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> str : set) {
            System.out.println(str.getKey()+"\t"+str.getValue());
        }
    }
}
