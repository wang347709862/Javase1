package service;

import data.UserData;
import pojo.User;

public class Services {
        UserData data=new UserData();
    public User zhuce(String name, int number, int password) {
        User u=data.zhuce(name,number,password);
        if(u==null)
        {
            System.out.println("用户名已存在，注册失败");
            return null;//通知控制层注册业务处理完了
        }
        else
        {
            System.out.println("注册成功，欢迎"+name+"，若要游玩请登录");
            return u;//通知控制层注册业务处理完了
        }
    }
}
