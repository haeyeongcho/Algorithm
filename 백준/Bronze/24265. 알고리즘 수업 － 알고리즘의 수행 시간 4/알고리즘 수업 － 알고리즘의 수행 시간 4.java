import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long result = n * (n - 1) / 2;
        bw.write(result + "\n" + 2);

        bw.flush();
        bw.close();
        br.close();
    }
}