import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int f0 = 0;
        int f1 = 1;

        if (n == 0) {
            System.out.println(f0);
        } else if (n == 1) {
            System.out.println(f1);
        } else {
            for (int i = 2; i <= n; i++) {
                int temp = f0 + f1;
                f0 = f1;
                f1 = temp;
            }
            System.out.println(f1);
        }
    }
}