import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            if (Integer.parseInt(input) % n == 0) {
                bw.write(input + " is a multiple of " + n + ".\n");
            } else {
                bw.write(input + " is NOT a multiple of " + n + ".\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}