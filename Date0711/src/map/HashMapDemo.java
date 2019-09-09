package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap();
        hm.put("it001", "马云");
        hm.put("it003", "马化腾");
        hm.put("it004", "乔布斯");
        hm.put("it005", "张朝阳");
        hm.put("it002", "裘伯君"); // wps
        hm.put("it001", "比尔盖茨");

        Set<String> s1 = hm.keySet();
//        for (String key : s) {
//            String value=hm.get(key);
//            System.out.println(key+"\t"+value);
//        Iterator<String> i1=s1.iterator();
//        while(i1.hasNext())
//        {
//            String key=i1.next();
//            System.out.println(key+"\t"+hm.get(key));
//        }
        Set<Map .Entry<String,String>> s2=hm.entrySet();
//        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry<String, String> str : s2) {
            String key=str.getKey();
            String value=str.getValue();
            System.out.println(key+"\t"+value);
        }
    }



}

