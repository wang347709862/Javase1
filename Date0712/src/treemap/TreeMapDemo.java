package treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        Student s1 = new Student("潘安", 30);
        Student s2 = new Student("柳下惠", 35);
        Student s3 = new Student("唐伯虎", 33);
        Student s4 = new Student("燕青", 32);
        Student s5 = new Student("唐伯虎", 33);

        // 存储元素
        tm.put(s1, "宋朝");
        tm.put(s2, "元朝");
        tm.put(s3, "明朝");
        tm.put(s4, "清朝");
        tm.put(s5, "汉朝");

        Set<Student> s = tm.keySet();
        for (Student student : s) {

            String value=tm.get(student);
            System.out.println(student.getName()+"\t"+student.getAge()+"\t"+value);
        }

    }
}
