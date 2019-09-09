package Datr0624;

public class Test01 {
    //1234四个数字能组成多少互不相同且无重复数字的四位数
    public static void main(String[] args){
        suanfa01();
    }
    public static void suanfa01(){
        int num=0;
        for(int a=1;a<5;a++){
            for(int b=1;b<5;b++){
                for(int c=1;c<5;c++){
                    if(a!=b & b!=c & a!=c)
                        num++;
                }
            }
        }
        System.out.println(num);
    }



}
