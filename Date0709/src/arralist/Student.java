package arralist;

public class Student {
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        Student o=(Student)obj;
        if(age!=o.age)
            return false;
        if(name==null)
        {
            if(o.name!=null)
                return false;
        }else if(!name.equals(o.name))
            return false;
        return true;
    }
}
