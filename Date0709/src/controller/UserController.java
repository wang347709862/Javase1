package controller;

import service.UserService;
import anli_vip.User;

public class UserController {
    UserService u=new UserService();
    public User select(String name){
        return u.select(name);
    }
}
