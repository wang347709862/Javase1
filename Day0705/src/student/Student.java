package student;

public class Student {
    private String name;
    private int age;
    Student(){
        System.out.println("这是构造方法");
    }
    Student(String s){
        System.out.println("这是带一个String参数的构造方法");
        name=s;
    }
    Student(int a){
        System.out.println("这是带一个int参数的构造方法");
        this.age=a;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if(age>100||age<0)
        {
            System.out.println("年龄错误");
        }
        else
        {
            this.age=age;
        }
    }


    public String getString(){
        return "helloWorld";
    }
    public void method(String name){
        System.out.println(name);
    }
    public String fuction(String s1,String s2){
        return s1+s2;
    }

    public void show(){
//        System.out.println("我爱学习，学习使我快乐");
        System.out.println(this.name+"\t"+this.age);
    }
}
