package StringDemp;

import java.util.Scanner;

public class GuessNumberGame {
    private GuessNumberGame(){}


    public static void main(String[] args){
        int number=(int)(Math.random()*100)+1;
        Scanner sc=new Scanner(System.in);
        while(true)
        {

            System.out.println("请输入你猜的数字");
            int x=sc.nextInt();
            if(x>number)
            {
                System.out.println("猜大了");
            }
            else if(x<number)
            {
                System.out.println("猜小了");
            }
            else
                System.out.println("猜对了");
            break;
        }
    }
}
