package set2;

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

    public int hashCode()
    {
        final int prime=31;
        int result=1;
        result=prime*result+age;
        result=prime*result+((name==null?0:name.hashCode()));
        return  result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        Student s=(Student)obj;
        if(age!=s.age)
            return false;
        if(name==null)
        {
            if(s.name!=null)
                return false;
        }else if(!name.equals(s.name))
            return false;
        return true;
    }
}
