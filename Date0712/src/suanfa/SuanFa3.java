package suanfa;

import java.util.Scanner;

public class SuanFa3 {
    public static void main(String[] args) {
//        小明有26种游戏海报，用小写字母"a"到"z"表示。
//        小明会把游戏海报装订成册（可能有重复的海报
//        ），册子可以用一个字符串来表示，每个字符
//        就表示对应的海报，例如abcdea。小明现在想
//        做一些“特别版”，然后卖掉。特别版就是会
//        从所有海报（26种）中随机选一张，加入到册
//        子的任意一个位置。
//        那现在小明手里已经有一种海报册子，再插入
//        一张新的海报后，他一共可以组成多少不同
//        的海报册子呢？
        Scanner sc=new Scanner(System.in);

        String cezi=sc.nextLine();
        System.out.println((cezi.length()+1)*26-cezi.length());
//        int num=0;
//        if(cezi.length()==1)
//        {
//            num=51;
//        }
//        else if(cezi.length()%2==1)
//        {
//            num=26*(cezi.length()-1)+50;
//        }
//        else
//        {
//            String s1=cezi.substring(0,cezi.length()/2-1);
//            String s2=cezi.substring(cezi.length()/2,cezi.length()-1);
//            if(s1.equals(s2))
//            {
//                num=26*(cezi.length()-2)+76;
//            }
//            else
//            {
//                num=26*(cezi.length()-1)+50;
//            }
//        }
//        System.out.println(num);
    }
}
