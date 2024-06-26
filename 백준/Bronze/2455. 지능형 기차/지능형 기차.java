import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int people = 0;
        int[] train = new int[4];

        for (int i = 0; i < train.length; i++) {
            String[] input = br.readLine().split(" ");
            people -= Integer.parseInt(input[0]);
            people += Integer.parseInt(input[1]);
            train[i] = people;
        }

        Arrays.sort(train);

        bw.write(train[train.length - 1] + "");

        bw.flush();
        bw.close();
        br.close();
    }
}