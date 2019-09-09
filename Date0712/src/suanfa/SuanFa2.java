package suanfa;

public class SuanFa2 {
    public static void main(String[] args) {
        //所有偶数都能表示成两个质数相加
        int num=102;
        for(int x=2;x<num/2+1;x++)
        {
            int next=num-x;
            if(isPrime(x)&&isPrime(next))
            {
                System.out.println(x+"\t"+next);
                break;
            }

        }
    }
    public static boolean isPrime(int x){
            for(int i=2;i<Math.sqrt(x);i++)
            {
                if(x%i==0)
                {
                    return false;
                }
            }
        return true;
    }

}
