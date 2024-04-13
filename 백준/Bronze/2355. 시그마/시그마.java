import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long N  = Long.parseLong(input[0]);
        long M = Long.parseLong(input[1]);
        long a = Math.min(N, M);
        long b = Math.max(N, M);

        long sum = ((b + 1) * b / 2) - (((a - 1) * a) / 2);

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}