import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long count = n * n * n;

        bw.write(count + "\n");
        bw.write("3");

        bw.flush();
        bw.close();
        br.close();

    }
}