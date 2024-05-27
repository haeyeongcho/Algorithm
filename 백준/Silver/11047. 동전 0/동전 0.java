import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int[] coins = new int[Integer.parseInt(input[0])];
        int result = 0;

        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int won = Integer.parseInt(input[1]);

        for (int i = coins.length - 1; i >= 0; i--) {
            if (won >= coins[i]) {
                result += (won / coins[i]);
                won %= coins[i];
            }
            if (won == 0) {
                break;
            }
        }

        bw.write(result+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}