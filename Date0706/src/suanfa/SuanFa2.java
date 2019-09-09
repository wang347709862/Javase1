package suanfa;

public class SuanFa2 {
    public static void main(String[] args) {
        int n=0;

        for(int i=0;i<100000;i++)
        {
            if(isPingfang(i+100)&&isPingfang(i+168))
            {
                n=i;
                break;
            }
        }
        System.out.println(n);
    }
    public static boolean isPingfang(int num){
        boolean a=false;
        for(int i=0;i<=Math.sqrt(num);i++)
        {
            if(num==(int)Math.pow(i,2))
            {
                a=true;
            }
        }
        return a;

    }
}
