import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] bread = new String[n];

        for (int i = 0; i < n; i++) {
            bread[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = m-1; j >= 0; j--) {
                bw.write(bread[i].charAt(j) + "");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}