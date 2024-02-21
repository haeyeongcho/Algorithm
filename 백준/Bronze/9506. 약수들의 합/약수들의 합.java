import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n + " = ");

            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sb.append(i).append(" + ");
                    sum += i;
                }
            }

            if (sum == n) {
                sb.delete(sb.length() - 3, sb.length());
                bw.write(sb.toString());
                bw.newLine();
            } else {
                bw.write(n + " is NOT perfect.");
                bw.newLine();
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}