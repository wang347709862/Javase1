package string;

public class StringDemo {
    public static void main(String[] args) {
        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        // 定义小串
        String minString = "java";
        System.out.println(tongji(maxString,minString));
    }

    public static int tongji(String a,String b) {
        int count=0;

        while(a.indexOf(b)!=-1){
            count++;
            a=a.substring(a.indexOf(b)+b.length());
        }
        return count;
    }
}
