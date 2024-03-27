import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int sum = 1;

        for (int i = 0; i < N; i++) {
            sum *= 2;
        }

        bw.write(Integer.toString(sum));

        bw.flush();
        bw.close();
        br.close();
    }
}