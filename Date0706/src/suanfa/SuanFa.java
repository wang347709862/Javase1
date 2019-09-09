package suanfa;

public class SuanFa {
//    企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，
//    奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部
//    分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之
//    间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万
//    元的部分，可提成3%；60万到100万之间时，高于60万元的部分，
//    可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从
//    键盘输入当月利润I，求应发放奖金总数？
public static void main(String[] args) {
    System.out.println(bonus(1000005));

}
public static long bonus(long profit)
{
    int prize=0;
    long yichu;
    if(profit>1000000)
    {
         yichu=profit-1000000;
         profit=1000000;
        prize+=yichu*0.01;
    }
    if(profit>600000)
    {
        yichu=profit-600000;
        profit=600000;
        prize+=yichu*0.015;
    }
    if(profit>400000)
    {
        yichu=profit-400000;
        profit=400000;
        prize+=yichu*0.03;
    }
    if(profit>200000)
    {
        yichu=profit-200000;
        profit=200000;
        prize+=yichu*0.075;
    }
    if(profit>100000)
    {
        yichu=profit-100000;
        profit=100000;
        prize+=yichu*0.1;
    }

    prize+=profit*0.1;
    return prize;
}
}
