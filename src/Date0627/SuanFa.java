package Date0627;

public class SuanFa {
//    今天上课，老师教了小易怎么计算加法和乘法，乘法的优先级大于加法，但是如果一个运算加了括号，那么它的优先级是最高的。例如：
//            1+2*3=7
//            1*(2+3)=5
//            1*2*3=6
//            (1+2)*3=9
//    现在小易希望你帮他计算给定3个数a，b，c，在它们中间添加"+"， "*"， "("， ")"符号，能够获得的最大值。
//    输入描述:
//    一行三个数a，b，c (1 <= a, b, c <= 10)
//    输出描述:
//    能够获得的最大值
//            示例1
//    输入
//
//            复制
//1 2 3
//    输出
//
//            复制
//9
    public static void main(String[] args){
        //相同符号不需要（）a+b+c a*b*c
        //有一个加一个乘 a+b*c (a+b)*c
        //              a*b+c a*(b+c)
        int max=max(1,2,3);
        System.out.println(max);
    }
    public static int max(int a,int b,int c){
        int a1=a+b+c;
        int a2=a*b*c;
        int a3=a+b*c;
        int a4=a*b+c;
        int a5=(a+b)*c;
        int a6=a*(b+c);
        int max=a1;
        max=max>a2?max:a2;
        max=max>a3?max:a3;
        max=max>a4?max:a4;
        max=max>a5?max:a5;
        max=max>a6?max:a6;
        return max;
    }
}
