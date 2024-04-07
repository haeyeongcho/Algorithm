import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        
        int count = 0;

        for (int i = 1; i * i <= num; i++) {
            count++;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}