import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            int d = Integer.parseInt(input[3]);

            int min = c - b;
            int max = d - a;

            if (a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            }

            bw.write(min + " " + max + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}