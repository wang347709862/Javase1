package arrastlisttest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Student>> a=new ArrayList<ArrayList<Student>>();
        ArrayList<Student> a1=new   ArrayList<Student>();
        Student s1= new Student("唐僧", 30);
        Student s2 = new Student("孙悟空", 29);
        Student s3 = new Student("猪八戒", 28);
        Student s4 = new Student("沙僧", 27);
        Student s5 = new Student("白龙马", 26);
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a1.add(s4);
        a1.add(s5);

        a.add(a1);

        ArrayList<Student> a2 = new ArrayList<Student>();
        // 创建学生
        Student s11 = new Student("诸葛亮", 30);
        Student s22 = new Student("司马懿", 28);
        Student s33 = new Student("周瑜", 26);
        // 学生进班
        a2.add(s11);
        a2.add(s22);
        a2.add(s33);
        // 把第二个班级存储到学生系统中
        a.add(a2);

        for(ArrayList<Student> x:a)
        {
            for(Student y:x)
            {
                System.out.println(y.getName()+"\t"+y.getAge());
            }
        }
    }
}
