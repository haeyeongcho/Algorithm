import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        char[] chars = input[0].toCharArray();
        int num = Integer.parseInt(input[1]);
        int decimal = 0;
        int n = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                decimal += ((int) chars[i] - 55) * Math.pow(num, n);
            } else {
                decimal += ((int) chars[i] - '0') * Math.pow(num, n);
            }
            n++;
        }
        System.out.println(decimal);
    }
}