package arralist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("林志玲", 40);
        Student s3 = new Student("凤姐", 35);
        Student s4 = new Student("芙蓉姐姐", 18);
        Student s5 = new Student("翠花", 16);
        Student s6 = new Student("林青霞", 27);
        Student s7 = new Student("林青霞", 18);

        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a1.add(s4);
        a1.add(s5);
        a1.add(s6);
        a1.add(s7);

        //方法1新建一个集合
//        ArrayList a2=new ArrayList();
//        for(int i=0;i<a1.size();i++)
//        {
//            Student s=(Student)a1.get(i);
//            if(!a2.contains(s))
//            {
//                a2.add(s);
//            }
//        }
//        System.out.println(a2);
        for(int i=0;i<a1.size()-1;i++)
        {
            for(int j=i+1;j<a1.size();j++)
            {
                Student sone=(Student)a1.get(i);
                Student stwo=(Student)a1.get(j);
                {
                    if(sone.equals(stwo))
                    {
                        a1.remove(j);
                        j--;
                    }
                }
            }
        }
        for(int i=0;i<a1.size();i++)
        {
            Student s=(Student)a1.get(i);
            System.out.println(s.getName()+"\t"+s.getAge());
        }
    }
}
