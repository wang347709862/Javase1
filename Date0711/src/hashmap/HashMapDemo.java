package hashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> hm=new LinkedHashMap<>();
        hm.put("2345", "hello");
        hm.put("1234", "world");
        hm.put("3456", "java");
        hm.put("1234", "javaee");
        hm.put("3456", "android");

        Set<String> s = hm.keySet();
        for (String key : s) {
            String value=hm.get(key);
            System.out.println(key+"\t"+value);
        }

    }
}
