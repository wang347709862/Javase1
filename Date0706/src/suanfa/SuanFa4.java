package suanfa;

public class SuanFa4 {
    public static void main(String[] args) {
        System.out.println("a,b,c的对手分别是"+mingdan());
    }
    public static String mingdan(){
        String[] a={"x","y","z"};
        String[] jia=new String[3];
        for(int i=0;i<3;i++)
        {
            jia[0]=a[i];
            for(int j=0;j<3;j++)
            {
                jia[1]=a[j];
                if(!jia[0].equals(jia[1]))
                {
                    for(int k=0;k<3;k++)
                    {
                        jia[2]=a[k];
                        if((!jia[0].equals(jia[2]))&&(!jia[1].equals(jia[2])))
                        {
                            if((!jia[0].equals("x"))&&(!jia[2].equals("x"))&&(!jia[2].equals("z")))
                            {
                                return jia[0]+","+jia[1]+","+jia[2];
                            }
                        }
                    }
                }
            }
        }
        return"";
    }
}
