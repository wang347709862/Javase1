package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SuanFa {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] numstr=br.readLine().split(" ");
        int length=0;//记录集合元素数

        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<numstr.length;i++)
        {
            length=hs.size();
            hs.add(numstr[i]);
            if(length==hs.size()){//没存入
                System.out.println(numstr[i]);
                break;
            }
        }
    }
}
