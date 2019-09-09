package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuanFa {

//    有一个X*Y的网格，小团要在此网格上从左上角到右下角，只能走格点且只能向右或向下走。请设计一个算法，计算小团有多少种走法。给定两个正整数int x,int y，请返回小团的走法数目。
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] xyStr=br.readLine().split(" ");
        int x=Integer.parseInt(xyStr[0])+1;
        int y=Integer.parseInt(xyStr[1])+1;
        System.out.println(x);

        int[][] a=new int[x][y];
        a[0][0]=0;
        a[0][1]=1;
        a[1][0]=1;
        fangfa(a);
        System.out.println(a[x-1][y-1]);
    }
    public static void fangfa(int[][] a){
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a[x].length;y++)
            {
                if(x!=0){//除了第一行，都加上一行的
                    a[x][y]+=a[x-1][y];
                }
                if(y!=0){//除了第一列，都加上一列的
                    a[x][y]+=a[x][y-1];
                }
            }
        }
    }
}
