import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int a1 = Integer.parseInt(input[0]);
        int a0 = Integer.parseInt(input[1]);

        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if (a1 * n + a0 <= c * n && c >= a1) {
            bw.write("1");
        } else {
            bw.write("0");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}