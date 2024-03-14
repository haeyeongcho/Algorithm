import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = 2;

        while (N != 1) {
            if (N % n == 0) {
                N /= n;
                sb.append(n + "\n");
                n = 2;
                continue;
            }

            n++;
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}