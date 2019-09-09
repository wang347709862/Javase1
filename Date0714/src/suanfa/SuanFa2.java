package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuanFa2 {
//    牛牛和妞妞在一天晚上决定一起去看一场情人节演唱会，可是由于这场演唱会实在太出名了，有很多情侣都来观看，牛牛和妞妞不小心被人流冲散了！
//    维持秩序的人决定，让大家排成一列，相邻两个进去的人（2k-1和2k，k为正整数）坐在相邻座位。但是现在的队伍乱糟糟的，有很多情侣都不在相邻位置。维持秩序的人同意让情侣们跟相邻的人交换位置，直到所有情侣都在2k-1和2k位置上为止。
//    但是维持秩序的人很没有耐心，所以需要最少的交换次数，你能帮情侣们算出这个次数吗？
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=br.read()-48;
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
        String[] numStr=br2.readLine().split(" ");
        int[] nums=new int[2*num];
        for(int i=0;i<2*num;i++)
        {
            nums[i]=Integer.parseInt(numStr[i]);
        }
        br.close();
        br2.close();

        int count=0;
        for(int i=0;i<=num*2-2;i+=2)//遍历奇数位
        {
            if(nums[i]!=nums[i+1])//和偶数位不同
            {
                for(int j=i+1;j<num*2;j++)//遍历偶数位之后的所有位
                {
                    if(nums[i]==nums[j])
                    {
                        int temp=nums[i+1];
                        nums[i+1]=nums[j];
                        nums[j]=temp;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
