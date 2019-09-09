package suanfa;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SuanFa3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count=0;

        for(int i=1;;i++){//无限延长
            for(int j=0;j<i;j++){//每个数字的个数为它本身
                count++;
                if(count==num){
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
