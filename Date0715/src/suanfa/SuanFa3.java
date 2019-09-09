package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuanFa3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String dixivStr=br.readLine();
        int dixiv=Integer.parseInt(dixivStr);
        int[][] nums=new int[dixiv][dixiv];

        int i=0;
        String line=null;
        while(i<dixiv &&(line=br.readLine())!=null){//存入数组
            String[] strs=line.split(" ");
            for(int j=0;j<dixiv;j++){
                nums[i][j]=Integer.parseInt(strs[j]);
            }
            i++;
        }

        int min=999999999;
        int is=0;//没有空地
        for(int x=0;x<dixiv;x++){
            for(int y=0;y<dixiv;y++){//遍历每个元素
                if(nums[x][y]==0){
                    is=1;
                    int temp=0;
                    for(int a=0;a<dixiv;a++){//从头遍历
                        for(int b=0;b<dixiv;b++){
                            if(nums[a][b]==1)//如果有房屋
                                temp+=Math.abs(x-a)+Math.abs(y-b);
//                            temp+=Math.sqrt(Math.pow(x-a,2)+Math.pow(y-b,2));距离竟然按走方格不按直线距离
                        }
                    }
                    min=Math.min(min,temp);
                }
            }
        }
        if(is==0){
            System.out.println("-1");
            return;
        }
        System.out.println(min);
    }
}
