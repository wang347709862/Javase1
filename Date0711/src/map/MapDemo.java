package map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("邓超", "孙俪");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "蔡依林");
        map.put("刘恺威", "杨幂");

//        System.out.println(map.remove("刘恺威"));
//        System.out.println(map.remove("刘dasdas恺威"));
//        System.out.println(map.containsKey("邓超"));
//        System.out.println(map.containsKey("邓dasda超"));
//        System.out.println(map);
//        System.out.println(map.);
//        LinkedHashMap h=new LinkedHashMap();
        Set<String> s=map.keySet();
        for (String s1 : s) {
            System.out.println(s1);
        }
        System.out.println("---------");

        Collection<String> c=map.values();
        for (String s1 : c) {
            System.out.println(s1);
        }
    }
}
