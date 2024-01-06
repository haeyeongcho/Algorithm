import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] str = new String[num];

        for (int i = 0; i < num; i++) {
            str[i] = br.readLine();
        }
        for (int i = 0; i < str.length; i++) {
            char[] ch = new char[str[i].length()];
            ch = str[i].toCharArray();
            System.out.print(ch[0]);
            System.out.print(ch[ch.length-1]+"\n");
        }
    }
}