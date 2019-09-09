package suanfa;

public class SuanFa {
    public static void main(String[] args) {
        double n1=2;
        double n2=1;
        double sum=0;
        for(int i=0;i<20;i++)
        {
            sum+=n1/n2;
            double d1=n1;
            double d2=n2;
            n1=d1+d2;
            n2=d1;
        }
        System.out.println(sum);
    }
}
