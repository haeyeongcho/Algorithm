import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        n1 = (n1 / 100) + (n1 % 100 / 10 * 10) + (n1 % 10 * 100);
        n2 = (n2 / 100) + (n2 % 100 / 10 * 10) + (n2 % 10 * 100);
        int num = (n1 > n2) ? n1 : n2;
        bw.write(Integer.toString(num));

        bw.flush();
        bw.close();
        br.close();
    }
}