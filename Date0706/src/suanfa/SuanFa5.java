package suanfa;

public class SuanFa5 {
    public static void main(String[] args) {
       int n=7;
       printStar(n);
    }
    public static void printStar(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                if(j>2*n-2*i-3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.print("  ");
            for(int j=0;j<2*(n-1)-1;j++)
            {
                if(j>=2*i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
