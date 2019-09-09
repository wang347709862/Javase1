package data;

import anli_vip.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    List li;
    static {
        User u1=new User("王利杰",123);
        List li=new ArrayList();
        li.add(u1);
    }
    public User select(String name){
        for(int i=0;i<li.size();i++)
        {
            Object o=li.get(i);
            User u=(User)o;
            if(u.getName().equals(name))
            {
                return u;
            }
        }
        return null;
    }
}
