package service;

import data.UserDao;
import anli_vip.User;

public class UserService {
    private UserDao u=new UserDao();
    public User select(String name){
        return u.select(name);
    }
}
