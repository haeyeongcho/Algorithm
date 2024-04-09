import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());

        for (long i = 0; i < test; i++) {
            long n = Long.parseLong(br.readLine());
            while (true) {
                long count = 0;
                for (long j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    if (n == 0 || n == 1) {
                        n = 2;
                    }
                    bw.write(n + "\n");
                    break;
                }
                n++;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}