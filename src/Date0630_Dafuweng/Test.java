package Date0630_Dafuweng;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        Operation op1=new Operation(2);//能有五个玩家
        Scanner sc=new Scanner(System.in);//键盘录入准备
        System.out.println("欢迎来到大富翁！");

        int num = 0;//记录用户选择功能
        User usernow = null;//记录登录的用户

        while (num != 6) {
            //主界面
            try {
                Thread.sleep(2000); //等待2秒.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("请选择你想做的操作");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.抽奖");
            System.out.println("4.修改密码");
            System.out.println("5.删除用户");
            System.out.println("6.关闭");

            num = sc.nextInt();//获取用户选择的功能
            int num2 = num;   //设置循环操作
            switch (num2) {
                case 1:
                    while(num2==1){
                        System.out.println("请输入账号昵称");
                        String name=sc.next();
                        System.out.println("请输入账号号码");
                        String number=sc.next();
                        System.out.println("请输入账号密码");
                        String password=sc.next();
                        usernow=new User(name,number,password);
                        ;//完成注册
                        if(op1.register(usernow)==-1){
                          usernow=null;//清空当前对象防止登录时误认
                            continue;
                        }
                        usernow=null;
                        System.out.println("是否继续注册用户？");
                        System.out.println("1.是");
                        System.out.println("6.否");
                        num2 = sc.nextInt();
                    }
                    break;
                case 2:
                        System.out.println("请输入账号号码");
                        String number=sc.next();
                        System.out.println("请输入账号密码");
                        String password=sc.next();
                        usernow= op1.login(number,password);//完成登录
                        if(usernow == null)
                        {
                            System.out.println("登录失败！");
                        }
                        else
                        {
                            System.out.println("登录成功！，欢迎"+usernow.getName());
                        }
                    break;

                case 3:
                    if(usernow==null){
                        System.out.println("您未登录！");
                        break;
                    }
                    while(num2==3){

                        try {
                            Thread.sleep(2000); //等待1秒.
                        } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("你的骰子数是：");
                        System.out.println(op1.game());//完成游戏
                        try {
                            Thread.sleep(2000); //等待1秒.
                        } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("是否继续游戏？");
                        System.out.println("1.是");
                        System.out.println("6.否");
                        num2 = sc.nextInt();
                    }
                    break;

                case 4:
                        System.out.println("请重新确认账号号码");
                        number=sc.next();
                        System.out.println("请输入密码");
                        password=sc.next();
                        System.out.println("请输入新密码");
                        String newPassword=sc.next();
                        op1.changePassword(number,password,newPassword);//完成修改密码
                        System.out.println("将返回主界面");

                    break;

                case 5:
                        System.out.println("请输入要删除的账号号码");
                         number=sc.next();
                        System.out.println("请输入密码");
                        password=sc.next();
                        op1.delete(number,password);//完成删除
                        System.out.println("将返回主界面");
                        break;
                case 6:
                    return;
            }
        }
    }
}
