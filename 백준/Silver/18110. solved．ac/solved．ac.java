import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] scores = new int[n];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(scores);

        int trimmedAverage = (int) (Math.round(scores.length * 0.15));

        int num = 0;
        double sum = 0;

        for (int i = trimmedAverage; i < scores.length - trimmedAverage; i++) {
            sum += scores[i];
            num++;
        }

        int result = (int) Math.round(sum / num);

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}