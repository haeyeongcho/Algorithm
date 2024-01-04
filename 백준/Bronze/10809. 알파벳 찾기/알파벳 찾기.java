import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] ch = s.toCharArray();
        int[] index = new int[26];

        Arrays.fill(index, -1);

        for (int i = 0; i < ch.length; i++) {
            if(index[(int)ch[i]-97] != -1)
                continue;
            index[(int)ch[i]-97] = i;
        }

        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i]+ " ");
        }
    }
}