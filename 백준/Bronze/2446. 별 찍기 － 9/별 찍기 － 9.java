import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        for (int i = input; i > 0; i--) {
            for (int j = input; j > i; j--) {
                bw.write(" ");
            }
            for (int j = i * 2 - 1; j > 0; j--) {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int i = 2; i <= input; i++) {
            for (int j = input; j > i; j--) {
                bw.write(" ");
            }
            for (int j = i * 2 - 1; j > 0; j--) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}