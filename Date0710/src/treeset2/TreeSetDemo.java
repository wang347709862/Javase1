package treeset2;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> t=new TreeSet<>();

        Student s1 = new Student("linqingxia", 27);
        Student s2 = new Student("zhangguorong", 29);
        Student s3 = new Student("wanglihong", 23);
        Student s4 = new Student("linqingxia", 27);
        Student s5 = new Student("liushishi", 22);
        Student s6 = new Student("wuqilong", 40);
        Student s7 = new Student("fengqingy", 22);
        Student s8 = new Student("linqingxia", 29);

        // 添加元素
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);
        t.add(s5);
        t.add(s6);
        t.add(s7);
        t.add(s8);

        for (Student s : t) {
            System.out.println(s.getName()+"\t"+s.getAge());
        }

    }
}
