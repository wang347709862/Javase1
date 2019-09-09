package set2;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private String color;
    private char sex;

    public Dog() {
        super();
    }

    public Dog(String name, int age, String color, char sex) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        final int prime=31;
        int result=1;
        result=result*prime+age;
        result=result*prime+((color==null)?0:color.hashCode());
        result=result*prime+((name==null)?0:name.hashCode());
        result=result*prime+sex;
        return result;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                sex == dog.sex &&
                Objects.equals(name, dog.name) &&
                Objects.equals(color, dog.color);
    }
//    @Override
//    public boolean equals(Object obj) {
//        if(this==obj)
//            return true;
//        if(obj==null)
//            return false;
//        if(getClass()!=obj.getClass())
//            return false;
//        Dog d=(Dog)obj;
//        if(age!=d.age)
//            return false;
//        if(color==null)
//        {
//            if(d.color!=null)
//                return false;
//        }else if(!color.equals(d.color))
//            return false;
//        if(name==null)
//        {
//            if(d.name!=null)
//                return false;
//        }else if(!name.equals(d.name))
//            return false;
//        if(sex!=d.sex)
//            return false;
//        return true;
//    }
}
