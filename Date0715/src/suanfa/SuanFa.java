package suanfa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuanFa {
    public static void main(String[] args) throws IOException {
//        给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
//        ("回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。)
//        具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
//        可用C++,Java,C#实现相关代码逻辑
//        入一个字符串S 例如“aabcb”(1 <= |S| <= 50), |S|表示字符串S的长度。
//        输出描述:
//        符合条件的字符串有"a","a","aa","b","c","b","bcb"
//
//        所以答案:7
        int count=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();//取每个子串
        int len = str.length();//字符串长度
        for (int i = 0; i < len; i++) {//起始位置
            for(int j=1;j<=len-i;j++){//子串长度
                String s=str.substring(i,i+j);
                if(isHuiwen(s))
                {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static boolean isHuiwen(String str) {//判断某个字符串是否回文
        char[] chs=str.toCharArray();
        int i=0;
        while((i!=chs.length-1-i) &(i<chs.length-1-i)){
            if(chs[i]!=chs[chs.length-1-i]){
               return false;
            }
            i++;
        }
        return true;
    }
}

