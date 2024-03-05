import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x_count = new int[3];
        int[] y_count = new int[3];

        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x_count[i] = Integer.parseInt(st.nextToken());
            y_count[i] = Integer.parseInt(st.nextToken());
        }
        
        if (x_count[0] == x_count[1]) {
            x = x_count[2];
        } else if (x_count[0] == x_count[2]) {
            x = x_count[1];
        } else if (x_count[1] == x_count[2]) {
            x = x_count[0];
        }

        if (y_count[0] == y_count[1]) {
            y = y_count[2];
        } else if (y_count[0] == y_count[2]) {
            y = y_count[1];
        } else if (y_count[1] == y_count[2]) {
            y = y_count[0];
        }
        
        bw.write(x + " " + y);
        
        bw.flush();
        bw.close();
        br.close();
    }
}