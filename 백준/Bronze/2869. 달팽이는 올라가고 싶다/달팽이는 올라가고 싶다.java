import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int top = Integer.parseInt(st.nextToken());

        int day = (top - up) / (up - down) + 1;
        int length = (up - down) * day;

        if (length + down >= top) {
            bw.write(String.valueOf(day));
        }else
            bw.write(String.valueOf(day+1));

        bw.flush();
        bw.close();
        br.close();
    }
}