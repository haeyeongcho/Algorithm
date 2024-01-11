import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int[] num = new int[input];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                continue;
            }
            bw.write(Integer.toString(num[i]));
            bw.newLine();
        }
        bw.write(Integer.toString(num[num.length - 1]));

        bw.flush();
        bw.close();
        br.close();
    }
}