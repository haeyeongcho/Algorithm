import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int[] A = new int[input1.length];

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(input1[i]);
        }

        int B = Integer.parseInt(input2[0]);
        int C = Integer.parseInt(input2[1]);

        long result = 0;

        for (int i = 0; i < N; i++) {
            int temp = A[i] - B;
            result++;
            if (temp <= 0) {
                continue;
            }
            int temp1 = temp / C;
            int temp2 = temp % C;

            if (temp2 > 0) {
                result += (temp1 + 1);
            } else {
                result += temp1;
            }
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}