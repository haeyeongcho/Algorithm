import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long count = (n * (n - 1) * (n - 2)) / 6;

        bw.write(count + "\n" + "3");

        bw.flush();
        bw.close();
        br.close();

    }
}