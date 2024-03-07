import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0 0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int[] arr = new int[3];
            arr[0] = a;
            arr[1] = b;
            arr[2] = c;

            Arrays.sort(arr);

            if (arr[2] >= arr[0] + arr[1]) {
                bw.write("Invalid\n");
                continue;
            }

            if (a == b && b == c) {
                bw.write("Equilateral\n");
            } else if (a == b || b == c || c == a) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}