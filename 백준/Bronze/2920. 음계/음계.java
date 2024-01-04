import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replaceAll(" ", "");

        int[] number = new int[s.length()];

        for (int i = 0; i < number.length; i++) {
            number[i] = Character.getNumericValue(s.charAt(i));
        }

        String ans = (number[0] == 1) ? "ascending" : "descending";

        for (int i = 0; i < number.length - 1; i++) {
            if (Math.abs(number[i] - number[i + 1]) > 1) {
                ans = "mixed";
                break;
            }
        }
        System.out.println(ans);
    }
}