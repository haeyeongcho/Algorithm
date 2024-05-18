import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] score1 = new int[4];
        int[] score2 = new int[2];
        int result = 0;

        for (int i = 0; i < score1.length; i++) {
            score1[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < score2.length; i++) {
            score2[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(score1);
        Arrays.sort(score2);

        for (int i = 1; i < score1.length; i++) {
            result += score1[i];
        }
        for (int i = 1; i < score2.length; i++) {
            result += score2[i];
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}