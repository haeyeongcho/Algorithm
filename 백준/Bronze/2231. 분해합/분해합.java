import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        int result = 0;

        while (true) {
            String str = Integer.toString(result);
            char[] ch = str.toCharArray();
            int[] n = new int[ch.length];
            int sum = 0;
            for (int i = 0; i < ch.length; i++) {
                n[i] = Integer.parseInt(String.valueOf(ch[i]));
                sum += n[i];
            }
            if (result + sum == num) {
                System.out.println(result);
                break;
            }
            result++;
            if (result == num) {
                System.out.println(0);
                break;
            }
        }
    }
}