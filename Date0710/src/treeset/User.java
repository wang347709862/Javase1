package treeset;

import java.util.Comparator;

public class User implements Comparable {
    private int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        User u=(User)o;
        if(this.age>u.getAge())
        {
            return 1;
        }
        else if(this.age<u.getAge())
        {
            return -1;
        }
        else
            return 0;
    }
}
