import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        double[] score = new double[num];
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(score);
        double answer = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = score[i] / score[score.length - 1] * 100;
            answer += score[i];
        }
        answer = answer / score.length;
        System.out.println(answer);
    }
}