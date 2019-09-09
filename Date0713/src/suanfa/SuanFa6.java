package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SuanFa6 {
    public static void main(String[] args) throws IOException {
        int count=0;
        int maxCount=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] ch=str.toCharArray();
        int[] counts=new int[ch.length];

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='['){
                count++;//当前维度
                counts[i]=count;//记录所有的count
            }else if(ch[i]==']'){
                count--;
            }
        }
        Arrays.sort(counts);
        System.out.println(counts[ch.length-1]);
    }
}
