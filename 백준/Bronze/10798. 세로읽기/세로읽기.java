import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] chars = new char[5][15];
        
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            char[] new_char = s.toCharArray();

            for (int j = 0; j < new_char.length; j++) {
                chars[i][j] = new_char[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (chars[j][i] != '\u0000') {
                    System.out.print(chars[j][i]);
                }
            }
        }
    }
}