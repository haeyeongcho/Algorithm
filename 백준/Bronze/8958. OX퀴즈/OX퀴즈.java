import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] test = new String[num];
        char[][] test_c = new char[num][80];
        int[] score = new int[num];


        for (int i = 0; i < num; i++) {
            test[i] = br.readLine();
        }
        for (int i = 0; i < num; i++) {
            test_c[i] = test[i].toCharArray();
        }
        for (int i = 0; i < test_c.length; i++) {
            int sum = 0;
            for (int j = 0; j < test_c[i].length; j++) {
                if (test_c[i][j] == 'O') {
                    sum++;
                    score[i] += sum;
                } else
                    sum = 0;
            }
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}