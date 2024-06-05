import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            if (n % 5 == 0) {
                count += n / 5;
                bw.write(count+"\n");
                break;
            }else{
                n -= 2;
                count++;
            }
            if (n < 0) {
                bw.write("-1");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}