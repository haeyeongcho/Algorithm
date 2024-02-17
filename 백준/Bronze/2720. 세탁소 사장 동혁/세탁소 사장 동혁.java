import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] test = new int[N];
        for (int i = 0; i < N; i++) {
            test[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < test.length; i++) {
            int result = test[i] / 25;
            sb.append(result).append(" ");
            result = test[i] % 25 / 10;
            sb.append(result).append(" ");
            result = test[i] % 25 % 10 / 5;
            sb.append(result).append(" ");
            result = test[i] % 25 % 10 % 5;
            sb.append(result).append("\n");
        }

        System.out.println(sb);

    }
}