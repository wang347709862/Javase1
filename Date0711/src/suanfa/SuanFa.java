package suanfa;

public class SuanFa {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int yidong=3;
        int[] a7=new int[a.length-yidong];
        int[] a3=new int[yidong];

        for(int i=0;i<a.length-yidong;i++)
        {
            a7[i]=a[i];
        }
        for(int i=0;i<yidong;i++)
        {
            a3[i]=a[a.length-yidong+i];
        }
        for(int i=0;i<a.length-yidong;i++)
        {
            a[i+yidong]=a7[i];
        }
        for(int i=0;i<yidong;i++)
        {
            a[i]=a3[i];
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
