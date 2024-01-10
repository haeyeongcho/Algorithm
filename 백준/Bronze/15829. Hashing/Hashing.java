import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] ch = new char[length];
        ch = str.toCharArray();

        int r = 31;
        int M = 1234567891;
        int result = 0;
        for (int i = 0; i < ch.length; i++) {
            int num = (((int) ch[i] - 96)) * ((int) (Math.pow(r, i)));
            result += num;
        }
        bw.write(Integer.toString(result % M));

        bw.flush();
        bw.close();
        br.close();
    }
}