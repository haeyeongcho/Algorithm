import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] number = br.readLine().split(" ");
            int n = Integer.parseInt(number[0]);
            int m = Integer.parseInt(number[1]);

            if (n == 0 && m == 0) {
                break;
            }
            if (m % n == 0) {
                System.out.println("factor");
            } else if (n % m == 0) {
                System.out.println("multiple");
            } else if (n % m != 0 || m % n != 0) {
                System.out.println("neither");
            }
        }
    }
}