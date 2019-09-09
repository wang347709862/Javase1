package p1;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String uname="admin";
        String upassword="123456";
        for(int x=0;x<3;x++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名");
            String name=sc.nextLine();
            System.out.println("请输入密码");
            String password=sc.nextLine();
            if(name.equals(uname) &&password.equals(upassword))
            {
                System.out.println("登陆成功");break;
            }
            else{
                if(x==2)
                {
                    System.out.println("账号锁定");
                }
                else
                {
                    System.out.println("你还有"+(2-x)+"次机会");
                }
            }
        }
    }
}
