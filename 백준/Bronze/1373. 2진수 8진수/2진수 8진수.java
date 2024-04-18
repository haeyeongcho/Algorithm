import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int len = input.length();
        StringBuilder result = new StringBuilder();

        while (len % 3 != 0) {
            input = "0" + input;
            len++;
        }

        for (int i = 0; i < len; i+=3) {
            int sum = (input.charAt(i) - '0') * 4 +
                    (input.charAt(i+1) - '0') * 2 +
                    (input.charAt(i+2) - '0');
            result.append(sum);
        }

        System.out.println(result);
    }
}