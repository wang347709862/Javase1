package suanfa;

public class SuanFa {
    public static void main(String[] args) {
        String[] strs={"abc","cad","m","fa","f"};
        for(int i=0;i<strs.length-1;i++)
        {
            for(int j=0;j<strs.length-1-i;j++)
            {
                if(strs[j].compareTo(strs[j+1])>0)
                {
                    String temp=strs[j];
                    strs[j]=strs[j+1];
                    strs[j+1]=temp;
                }
            }
        }
        for (String str : strs) {
            System.out.println(str);
        }
    }

}
