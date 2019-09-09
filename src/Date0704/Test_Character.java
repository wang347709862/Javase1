package Date0704;

import Date0628.ChangFang;

import java.util.Scanner;

public class Test_Character {
    public static void main(String[] args) {
//        System.out.println(Character.isUpperCase('A'));
//        System.out.println(Character.isUpperCase('a'));
//        System.out.println(Character.isUpperCase('0'));
//        System.out.println(Character.toUpperCase('a'));
//        System.out.println(Character.toUpperCase('A'));
//        System.out.println(Character.toUpperCase('0'));
        int upper=0;
        int lower=0;
        int digit=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] chararray=s.toCharArray();
        for(int i=0;i<chararray.length;i++)
        {
            if(Character.isUpperCase(chararray[i]))
            {
                upper++;
            }
            else if(Character.isLowerCase(chararray[i])){
                lower++;
            }
            else if(Character.isDigit(chararray[i])){
                digit++;
            }
        }
        System.out.println("大写字母："+upper+"小写字母:"+lower+"数字："+digit);
    }
}
