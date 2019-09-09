package regex;

import java.util.Scanner;

public class RegexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的QQ号码：");
        String qq = sc.nextLine();
        boolean flag=true;
        if(!qq.startsWith("0")){
            if(qq.length()>=5 &&qq.length()<=15){
                char[] qqch=qq.toCharArray();
                for (char c : qqch) {
                    if(!Character.isDigit(c)){
                        flag=false;
                        break;
                    }
                }
            }
            else{
                flag=false;
            }
        }else{
           flag=false;
        }
        System.out.println(flag);
    }
}
