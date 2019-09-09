package Date0628;
import java.util.*;

public class SuanFa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=zhuanHuan(sc.nextDouble());
        System.out.println(a);
    }
    public static String zhuanHuan(double num){
        num=Math.abs(num);
        int count=0;
        for(int i=32;i>=0;i--)
        {
            double temp=Math.pow(2,i);
            if(num/temp >=1)
            {
                count++;
                num%=temp;
            }
            else
                continue;
        }
        return (""+count);
    }
}
