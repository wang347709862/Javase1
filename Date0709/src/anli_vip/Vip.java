package anli_vip;

import controller.UserController;

import java.util.Scanner;

public class Vip {
        private static UserController u=new UserController();
    public static void main(String[] args) {
        System.out.println("欢迎来到xx超市！");
        System.out.println("请输入你接下来的想法：");

        endding:while(true)
        {
            System.out.println("1.查看个人信息");
            System.out.println("2.查看商品信息");
            System.out.println("3.购物");
            System.out.println("4.离开");
            Scanner sc=new Scanner(System.in);
            int select=sc.nextInt();
            switch (select)
            {
//                System.out.println("");
                case 1:
//                    if(u.select()!=null)
                    {

                    }
                case 2:
                case 3:
                case 4:
                    System.out.println("欢迎下次再来");
                    break endding;
            }
        }
    }
}
