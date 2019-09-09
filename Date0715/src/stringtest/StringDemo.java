package stringtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) throws IOException {
        String username="admin";
        String password="123456";

        for(int x=0;x<3;x++){
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入用户名");
            String name=br.readLine();
            System.out.println("请输入密码");
            String pass=br.readLine();


            if(name.equals(username) && pass.equals(password)){
                System.out.println("登陆成功");
                break;
            }else{
                if(x==0 || x==1){
                    System.out.println("密码错误，你还有"+(2-x)+"次机会");
                }else{
                    System.out.println("被锁定了233");
                }
            }
        }

    }
}
