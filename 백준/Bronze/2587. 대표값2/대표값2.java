import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] number = new int[5];
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(br.readLine());
            sum += number[i];
        }

        Arrays.sort(number);

        int median = number[number.length / 2];
        int average = sum / 5;

        bw.write(average + "\n");
        bw.write(median+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}