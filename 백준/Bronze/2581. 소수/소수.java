import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;
        boolean flag = true;

        StringBuilder sb = new StringBuilder();

        for (int i = M; i <= N; i++) {
            if (i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag == true) {
                sum += i;
                sb.append(i).append(" ");
            }
        }

        if (sb.length() > 0) {
            String[] str = sb.toString().split(" ");
            min = Integer.parseInt(str[0]);
            bw.write(sum + "\n");
            bw.write(min + "\n");
        } else {
            bw.write(-1 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}