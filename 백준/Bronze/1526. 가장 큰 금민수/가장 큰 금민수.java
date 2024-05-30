import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        while (true) {
            if (isLucky(N)) {
                break;
            }
            N--;
        }

        bw.write(N + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
    public static boolean isLucky(int number){
        while (number > 0) {
            int digit = number % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}