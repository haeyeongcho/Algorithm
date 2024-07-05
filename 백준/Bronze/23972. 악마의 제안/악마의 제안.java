import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long K = Long.parseLong(input[0]);
        long N = Long.parseLong(input[1]);

        if (N == 1) {
            bw.write("-1\n");
        } else {
            long result = (N * K + (N - 2)) / (N - 1);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
