import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = 0;
        while (true) {
            n++;
            String[] input = br.readLine().split(" ");
            int L = Integer.parseInt(input[0]);
            int P = Integer.parseInt(input[1]);
            int V = Integer.parseInt(input[2]);

            if (L == 0 && P == 0 && V == 0) {
                break;
            }

            int result = 0;

            int temp = V / P;
            int temp2 = V % P;

            if (temp2 > L) {
                temp2 = L;
            }
            result = temp * L + temp2;

            bw.write("Case " + n + ": " + result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}