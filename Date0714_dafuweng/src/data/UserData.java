package data;

import pojo.User;

public class UserData {
    {
        user[0]=new User("王利杰",1,123456);
    }
    private static User[] user=new User[3];//设定初始容量为3,包含一个管理员user[0]
//    user[0]=new User("王利杰",347709862,123456);

    private static int count=1;

    public User zhuce(String name,int number, int password) {
        for(int i=0;i<count;i++){//与已存在的账号比对
            if(user[i].getNumber()==number){//账号相同
                return null;//通知业务层账号已存在
            }
            if(i==count-1) {//账号不同，前边都不重复，遍历到了最后一位，此时存入
                if(count>=3){//需要新建数组
                    User[] usernew=new User[count+1];//长度+1
                    for(int j=0;j<count;j++) {
                        usernew[j]=user[j];//复制
                    }
                    usernew[count]=new User(name,number,password);
                    user=usernew;//指向usernew，现在user和usernew等效
                    count++;
                    return user[count-1];//通知业务层注册成功并返回这个User对象
                }else{//直接存入
                    user[i+1]=new User(name,number,password);
                    count++;
                    return user[i+1];//通知业务层注册成功并返回这个User对象
                }
            }
        }
        return null;
    }
}
