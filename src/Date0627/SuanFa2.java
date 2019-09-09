package Date0627;
//Z国的货币系统包含面值1元、4元、16元、64元共计4种硬币，以及面值1024元的纸币。现在小Y使用1024元的纸币购买了一件价值为
//        N
//        (
//        0
//        <
//        N
//        ≤
//        1024
//        )
//        N(0<N≤1024)的商品，请问最少他会收到多少硬币？
//输入描述:
//        一行，包含一个数N。
//        输出描述:
//        一行，包含一个数，表示最少收到的硬币数。
//        示例1
//        输入
//
//        复制
//        200
//        输出
//
//        复制
//        17
import java.util.Scanner;
public class SuanFa2 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int money=1024-num;
        int count=0;
        count+=money/64;
        money=money%64;
        if(money!=0)
        {
            count+=money/16;
            money=money%16;
            if(money!=0){
                count+=money/4;
                money=money%4;
                if(money!=0){
                    count+=money;
                }
            }
        }
        System.out.println(count);
    }
}
