package collection1;

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemo {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        Student s1=new Student("a1",23);
        Student s2=new Student("a2",24);
        Student s3=new Student("a3",25);
        Student s4=new Student("a4",26);
        Student s5=new Student("a5",27);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

        Object[] o=c.toArray();
        for(int i=0;i<o.length;i++)
        {
            Student s=(Student)o[i];
            System.out.println(s.getName());
        }
    }
}
