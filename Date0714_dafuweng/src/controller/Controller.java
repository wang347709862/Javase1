package controller;

import pojo.User;
import service.Services;

public class Controller {
    private Services scs=new Services();
    public User zhuce(String name, int number, int password) {
        return scs.zhuce(name,number,password);
    }
}
