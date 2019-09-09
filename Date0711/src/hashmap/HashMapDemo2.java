package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<Student ,String> hm=new HashMap<>();
        Student s1 = new Student("貂蝉", 27);
        Student s2 = new Student("王昭君", 30);
        Student s3 = new Student("西施", 33);
        Student s4 = new Student("杨玉环", 35);
        Student s5 = new Student("貂蝉", 27);

        // 添加元素
        hm.put(s1, "8888");
        hm.put(s2, "6666");
        hm.put(s3, "5555");
        hm.put(s4, "7777");
        hm.put(s5, "9999");

//        Set<Integer> s = hm.keySet();
//        for (Integer key : s) {
//            String value=hm.get(key);
//            System.out.println(key+"\t"+value);
//        }
        Set<Map.Entry<Student, String>> s = hm.entrySet();
        for (Map.Entry<Student, String> keyandvalue : s) {
            Student key=keyandvalue.getKey();
            String value=keyandvalue.getValue();
            System.out.println(key.getName()+"\t"+key.getAge()+"\t"+value);
        }

    }

}
