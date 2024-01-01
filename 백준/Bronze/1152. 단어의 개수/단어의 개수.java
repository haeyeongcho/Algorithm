import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int n = 0;
        String str[] = s.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i] == ""){
                continue;
            }
            n++;
        }
        System.out.println(n);

        br.close();
    }
}