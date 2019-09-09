package suanfa;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class SuanFa {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int length=Integer.parseInt(br.readLine());
        System.out.println(length+1+(length-1)*length/2);
    }
}
