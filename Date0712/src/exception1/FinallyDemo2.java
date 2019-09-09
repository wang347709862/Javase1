package exception1;

import java.util.Scanner;

public class FinallyDemo2 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("输入学生成绩：");
        int score=500;
        Teacher t=new Teacher();
        try{
            t.check(score);
        }catch(MyException e)
        {
            e.printStackTrace();
        }
    }
}
