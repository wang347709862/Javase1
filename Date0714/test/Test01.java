import org.junit.Test;

public class Test01 {
    @Test
    public  void isHuiwen() {
        String str="aa";
        char[] chs=str.toCharArray();
        int i=0;
        while(i!=chs.length-1-i){
            if(chs[i]!=chs[chs.length-1-i]){
                System.out.println("不是");
                return;
//                return false;

            }
        }
        System.out.println("是");
//        return true;
    }
}
