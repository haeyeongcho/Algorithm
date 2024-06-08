import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("/");

        int K = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int A = Integer.parseInt(input[2]);

        if (K + A < D || D == 0) {
            bw.write("hasu");
        } else {
            bw.write("gosu");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}