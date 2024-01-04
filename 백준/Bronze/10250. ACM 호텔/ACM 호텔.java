import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][3];
        int[] result = new int[num];

        for (int i = 0; i < num; i++) {
            String s = br.readLine();
            String[] tokens = s.split(" ");
            arr[i][0] = Integer.parseInt(tokens[0]);
            arr[i][1] = Integer.parseInt(tokens[1]);
            arr[i][2] = Integer.parseInt(tokens[2]);
        }

        for (int i = 0; i < result.length; i++) {
            int n1 = arr[i][2] % arr[i][0];
            int n2 = arr[i][2] / arr[i][0] + 1;
            if(n1 == 0) {
                n1 = arr[i][0];
                n2 = arr[i][2] / arr[i][0];
            }
            result[i] = n1 * 100 + n2;
            System.out.println(result[i]);
        }
    }
}