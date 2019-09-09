package suanfa;

public class SuanFa {
    public static void main(String[] args) {
//        int a=789;
//        String s=String.valueOf(a);
//        System.out.println(s);
//        String s2=s.substring(0,2);
//        System.out.println(s2);
        int[] a={1,10,3,456,13,2,15,256,165,15,3,15};
        int maxindex=0;
        int minindex=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[maxindex])
            {
                maxindex=i;
            }
            if(a[i]<a[minindex])
            {
                minindex=i;
            }
        }//获得最大和最小的下标
        if(maxindex!=minindex)//如果元素不是全部相同
        {
            int temp=a[0];
            a[0]=a[maxindex];
            a[maxindex]=temp;//先交换最大的
            if(minindex==0)//最小的恰好是第一个，被换到maxindex的位置了
            {
                temp=a[a.length-1];
                a[a.length-1]=a[maxindex];
                a[maxindex]=temp;
            }else//正常交换
            {
                temp=a[a.length-1];
                a[a.length-1]=a[minindex];
                a[minindex]=temp;
            }

        }
       for(int i=0;i<a.length;i++)
           System.out.print(a[i]+"\t");

    }
}
