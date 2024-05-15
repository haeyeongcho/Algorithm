import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                result++;
            } else if (input.charAt(i) == 'e') {
                result++;
            } else if (input.charAt(i) == 'i') {
                result++;
            } else if (input.charAt(i) == 'o') {
                result++;
            } else if (input.charAt(i) == 'u') {
                result++;
            }
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}