package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuanFa2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int sum=0;
        String[] str=br.readLine().split(" ");
        for(int i=0;i<num;i++){
            sum+=Integer.parseInt(str[i])-1;
        }
        System.out.println(sum);
    }
}
