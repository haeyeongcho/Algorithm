import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int n = 0;
        int sum = 0;

        while (true) {
            sum += n;

            if (x <= sum) {
                break;
            }

            n++;
        }

        int up = 0;
        int down = 0;

        if (n % 2 != 0) {
            up = 1;
            down = n;

            for (int i = 0; i < sum - x; i++) {
                up++;
                down--;
            }

        } else {
            up = n;
            down = 1;

            for (int i = 0; i < sum - x; i++) {
                up--;
                down++;
            }
        }
        
        bw.write(up + "/" + down);

        bw.flush();
        bw.close();
        br.close();
    }
}