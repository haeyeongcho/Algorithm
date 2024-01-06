import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] index = new int[30];
        Arrays.fill(index, 0);

        for (int i = 0; i < index.length - 2; i++) {
            int num = Integer.parseInt(br.readLine());
            index[num - 1] = num;
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i] == 0)
                System.out.println(i + 1);
        }
    }
}