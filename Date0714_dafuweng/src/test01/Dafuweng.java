package test01;

import controller.Controller;

import java.util.Scanner;

public class Dafuweng {
    public static void main(String[] args) {
        Controller ctl=new Controller();
        //主界面尽量只显示用户看到的内容，不应该涉及到响应的过程
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while(choice!=4)
        {
            System.out.println("欢迎游玩大富翁！\n您可以");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.游戏");
            System.out.println("4.离开");

            choice=sc.nextInt();//记录用户在主界面选择的功能
            switch (choice){
                case 1:
                {
                    int choice1=1;//记录用户是否继续注册
                    while(choice1==1)
                    {
                        Scanner sc2=new Scanner(System.in);
                        System.out.println("请输入昵称");
                        String name=sc2.nextLine();
                        System.out.println("请输入账号");
                        int number=sc2.nextInt();
                        System.out.println("请输入密码");
                        int password=sc2.nextInt();//接收输入
                        ctl.zhuce(name,number,password);//完成注册，注册结果在业务层已经输出了
                        System.out.println("是否继续注册？\n1.继续\n2.返回主界面");
                        choice1=sc.nextInt();
                        if(choice==2)
                            break;//退出循环并回到主界面
                    }
                    break;//退出注册功能

                }
                case 2:
                case 3:
                case 4:
                {
                    System.out.println("希望您玩的开心，再见！");
                    return;
                }
            }
        }
    }
}
