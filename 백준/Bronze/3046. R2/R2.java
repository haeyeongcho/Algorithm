import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int r1 = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);

        int r2 = s * 2 - r1;

        bw.write(r2 + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}