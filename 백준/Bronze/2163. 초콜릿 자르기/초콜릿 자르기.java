import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int result = 0;

        if (N - 1 == 0) {
            result = M - 1;
        } else {
            result = (N - 1) + ((M - 1) * N);
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}