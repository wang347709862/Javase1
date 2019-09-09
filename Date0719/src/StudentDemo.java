public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建学生对象
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(27);

        //克隆学生对象
        Object obj = s.clone();
        Student s2 = (Student)obj;
        System.out.println("---------");

        System.out.println(s.getName()+"---"+s.getAge());
        System.out.println(s2.getName()+"---"+s2.getAge());


        //其实是有区别的


    }
}
