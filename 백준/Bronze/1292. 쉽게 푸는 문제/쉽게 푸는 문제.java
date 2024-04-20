import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[1000];
        int index = 0;
        int number = 1;

        while (index < 1000) {
            for (int i = 0; i < number; i++) {
                array[index] = number;
                index++;
                if (index >= 1000) {
                    break;
                }
            }
            number++;
        }

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int sum = 0;

        for (int i = a - 1; i < b; i++) {
            sum += array[i];
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}