import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int r1 = Integer.parseInt(input[2]);

            int x2 = Integer.parseInt(input[3]);
            int y2 = Integer.parseInt(input[4]);
            int r2 = Integer.parseInt(input[5]);

            bw.write(point(x1, y1, r1, x2, y2, r2)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int point(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (distance == Math.pow((r2 - r1), 2)) {
            return 1;
        } else if (distance == Math.pow((r1 + r2), 2)) {
            return 1;
        } else if (distance < Math.pow((r2 - r1), 2)) {
            return 0;
        } else if (distance > Math.pow((r2 + r1), 2)) {
            return 0;
        } else {
            return 2;
        }
    }
}