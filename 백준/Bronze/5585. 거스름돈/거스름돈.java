import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        input = 1000 - input;

        int result = 0;
        int[] changes = new int[]{500, 100, 50, 10, 5, 1};

        for (int i : changes) {
            if (input / i > 0) {
                result += input / i;
                input %= i;
            }
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}