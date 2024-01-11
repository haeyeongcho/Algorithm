import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int bc = factorial(N) / (factorial(K) * factorial(N - K));

        bw.write(String.valueOf(bc));
        bw.flush();
        bw.close();
        br.close();
    }
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return factorial(n - 1) * n;
    }
}