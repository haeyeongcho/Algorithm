import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            String[] str = s.split(" ");
            int num[] = new int[str.length];

            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(str[i]);
            }
            
            Arrays.sort(num);
            
            if (num[0] == 0 && num[1] == 0 && num[2] == 0) {
                break;
            }

            if (num[0] * num[0] + num[1] * num[1] == num[2] * num[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}