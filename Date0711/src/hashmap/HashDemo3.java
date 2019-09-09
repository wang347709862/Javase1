package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashDemo3 {
    public static void main(String[] args) {
        HashMap<String,Student> hm=new HashMap<>();
        Student s1 = new Student("周星驰", 58);
        Student s2 = new Student("刘德华", 55);
        Student s3 = new Student("梁朝伟", 54);
        Student s4 = new Student("刘嘉玲", 50);

        // 添加元素
        hm.put("9527", s1);
        hm.put("9522", s2);
        hm.put("9524", s3);
        hm.put("9529", s4);

        Set<Map.Entry<String, Student>> s = hm.entrySet();
        for (Map.Entry<String, Student> keyandvalue : s) {
            String key=keyandvalue.getKey();
            Student value=keyandvalue.getValue();
            System.out.println(key+"\t"+value.getName()+"\t"+value.getAge());
        }
    }
}
