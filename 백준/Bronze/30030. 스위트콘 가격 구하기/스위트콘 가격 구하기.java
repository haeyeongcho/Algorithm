import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int B = Integer.parseInt(br.readLine());

        bw.write((B / 11 * 10) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}