import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] num_set = new int[10];

        for (int i = 0; i < input.length(); i++) {
            num_set[Integer.parseInt(String.valueOf(input.charAt(i)))]++;
        }

        num_set[6] = (num_set[6] + num_set[9] + 1) / 2;
        num_set[9] = 0;

        Arrays.sort(num_set);

        bw.write(num_set[num_set.length - 1] + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}