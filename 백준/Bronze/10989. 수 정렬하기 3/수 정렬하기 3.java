import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] num_arr = new int[num];
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num_arr);
        for (int i : num_arr) {
            bw.write(Integer.toString(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}