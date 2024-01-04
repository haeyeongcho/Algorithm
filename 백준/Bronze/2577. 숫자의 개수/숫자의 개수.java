import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 1;
        int[] index = new int[10];

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            sum *= Integer.parseInt(s);
        }

        String s = Integer.toString(sum);
        int[] arr = new int[s.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
            index[arr[i]]++;
        }
        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i]);
        }
    }
}