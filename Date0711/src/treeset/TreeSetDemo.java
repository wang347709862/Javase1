package treeset;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>();
        // 创建元素
        Student s1 = new Student("linqingxia", 27);
        Student s2 = new Student("zhangguorong", 29);
        Student s3 = new Student("wanglihong", 23);
        Student s4 = new Student("linqingxia", 27);
        Student s5 = new Student("liushishi", 22);
        Student s6 = new Student("wuqilong", 40);
        Student s7 = new Student("fengqingy", 22);
        Student s8 = new Student("linqingxia", 29);

        // 添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        ts.add(s8);

        for (Student t : ts) {
            System.out.println(t.getName()+"\t"+t.getAge());
        }
    }
}
