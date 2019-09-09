package Date0630_Dafuweng;

import java.util.Random;

public class Operation {
    private int size;

    //构造
    Operation() {
    }

    Operation(int size) {//传入用户数组的大小即用户数
        user = new User[size];
        this.size = size;
    }

    //变量
    private User[] user = null;//用户数组
    private static int count = 0;//遍历用户数组
    Random r1 = new Random();

    //方法

    //注册
    public int register(User user1) {
        if (count >= 0 & count < size) {
            for (int i = 0; i <= count - 1; i++) {
                if (user[i] != null) {
                    if (user[i].getNumber().equals(user1.getNumber()))//如果传入用户的账号在用户数组中已存在
                    {
                        System.out.println("账号已存在，请重新输入！");
                        return -1;//直接结束方法
                    }
                } else {
                    user[count] = user1;//直接存入
                    count++;
                    return 0;
                }
            }
        } else//            (user[count-1]!=null)//用户数组满了
        {
            User[] temp = user;//暂存user数组
            user = new User[count + 1];//新数组长度+1
            for (int i = 0; i < count; i++) {
                user[i] = temp[i];//拷贝user数组
            }
            for (int i = 0; i <= count - 1; i++) {
                if (user[i].getNumber().equals(user1.getNumber()))//如果传入用户的账号在用户数组中已存在
                {
                    System.out.println("账号已存在，请重新输入！");
                    return -1;//直接结束方法
                }
            }
            user[count] = user1;//直接存入
            count++;
        }
        return 0;
    }


    //登录，传入的是用户
    public User login(User user1) {
        for (int i = 0; i < count; i++) {
            if (user1.getNumber().equals(user[i].getNumber()))//有该账号
            {
                if (user1.getPassword().equals(user[i].getPassword())) {
                    return user[i];//且密码对应
                }
            }
        }
        return null;//否则返回null
    }

    //登录，传入的是用户账号和密码
    public User login(String number, String password) {
        for (int i = 0; i < count; i++) {
            if (number.equals(user[i].getNumber()))//有该账号
            {
                if (password.equals(user[i].getPassword())) {
                    return user[i];//且密码对应
                }
            }
        }
        return null;//否则返回null
    }

    //游戏
    public int game() {
        int i = 1 + r1.nextInt(5);
        return i;
    }


    //修改密码，目前没有判断
    public void changePassword(String number, String password, String newPassword) {
        int index = pipei(number, password);//方法1：匹配
        if (index == -1) {
            System.out.println("账号信息有误!将回到主界面");
            return;

        }
        chuanru(index, newPassword);//方法2：传入
    }

    //方法1：匹配
    public int pipei(String number, String password) {
        for (int i = 0; i < count; i++) {
            if (number.equals(user[i].getNumber()))//有该账号
            {
                if (password.equals(user[i].getPassword())) {
                    return i;//且密码对应
                }
            }
        }
        return -1;//否则返回-1
    }

    //方法2：传入
    public void chuanru(int index, String newPassword) {
        user[index].setPassword(newPassword);
    }

    //删除，目前可以判断输入的账户不存在还是密码有误
    public void delete(String number, String password) {
        if (count == 1)//情况特殊单独判断一下
        {
            if (number.equals(user[0].getNumber()))//有该账号
            {
                if (password.equals(user[0].getPassword())) {
                    user = null;
                    count--;
                    return;
                }
            } else {
                System.out.println("账户不存在");
                return;
            }

        }
        for (int i = 0; i < count; i++) {
            if (number.equals(user[i].getNumber()))//有该账号
            {

                if (password.equals(user[i].getPassword())) {
                    for (int j = i; j < count - 1; j++) {
                        user[i] = user[i + 1];//把删除位置以后的元素往前挪一位
                    }
                    user[count - 1] = null;//最后一位设为空
                    count--;
                    return;
                }
            }

        }//有该账号或者有账号但密码不匹配就已经退出了
        if (!(user[count - 1].getNumber().equals(number)))//不存在该账号
            System.out.println("账户不存在");
        else//有账户但密码不匹配
            System.out.println("密码错误！");
    }
}
