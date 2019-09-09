package set2;

import java.util.HashSet;

public class HashCodeDemo {
    public static void main(String[] args) {
        HashSet<Student> h=new HashSet<>();
        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("柳岩", 22);
        Student s3 = new Student("王祖贤", 30);
        Student s4 = new Student("林青霞", 27);
        Student s5 = new Student("林青霞", 20);
        Student s6 = new Student("范冰冰", 22);

        // 添加元素
        h.add(s1);
        h.add(s2);
        h.add(s3);
        h.add(s4);
        h.add(s5);
        h.add(s6);

        for (Student s : h) {
            System.out.println(s.getName()+"\t"+s.getAge());
        }
    }

}
