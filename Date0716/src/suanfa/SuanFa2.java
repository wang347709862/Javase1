package suanfa;

import java.io.*;

public class SuanFa2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps=System.out;
        InputStream in = System.in;
        Integer max=Integer.MAX_VALUE;
        String numstr=br.readLine();
        char[] a=numstr.toCharArray();
        System.out.println(sum(a));
    }
    public static int sum(char[] a){
        int sum=0;
        int fuhao=1;//正数
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++){

            int now=0;
            if(i==a.length-1){//最后一位直接加上
                sb.append(a[i]);
                String laststr=sb.toString();
                now=Integer.parseInt(laststr);
                sum+=now*fuhao;
                return sum;
            }

            if(i==0 && a[i]=='-'){//第一位为负
                fuhao=-1;//设置符号位
                sb.append("0");//防止空字符串转换成int异常
            }else if(a[i]=='-'){//上个数字已结束
                String nowstr=sb.toString();
                now=Integer.parseInt(nowstr);
                sum+=now*fuhao;
                sb.delete(0,nowstr.length());//把前面的数字加上

                fuhao=-1;//设置符号位

            }else if(a[i]=='+'){//上个数字已结束
                String nowstr=sb.toString();
                now=Integer.parseInt(nowstr);
                sum+=now*fuhao;
                sb.delete(0,nowstr.length());//把前面的数字加上
                fuhao=1;//设置符号位
            }else{
               sb.append(a[i]);//数字未结束，拼接
            }
        }
        return 0;
    }
}
