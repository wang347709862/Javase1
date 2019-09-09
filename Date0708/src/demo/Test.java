package demo;

public class Test {
    public static void main(String[] args) {
        Student[] s=new Student[5];
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Student();
            s[i].id=i;
            System.out.println("学生"+s[i].id);
        }
    }
}
