package suanfa;

import java.util.ArrayList;
import java.util.Scanner;

public class SuanFa4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<>();

        for(int i=0;i<1000;i++)
        {
            int num=sc.nextInt();
            array.add(num);
        }

        int is=1;
        int count=0;
        for(int i=0;i<array.size();i++)
        {
            Integer num1=array.get(i);
            Integer num2=array.get(i+1);
            if(num1>num2)
            {
                if(count==1)
                {
                    is=0;
                    break;
                }
                array.set(i+1,num1);
                count++;
            }
        }
        System.out.println(is);
//



    }
}
