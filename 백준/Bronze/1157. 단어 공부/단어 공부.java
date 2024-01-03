import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        s = br.readLine();
        s = s.toUpperCase();

        int[] countA = new int[26];
        char[] chararr = s.toCharArray();
        int max = -1;
        int index = 0;
        int count = 0;

        for (int i = 0; i < chararr.length; i++) {
            int num = chararr[i];
            countA[num - 65]++;
        }
        for (int i = 0; i < countA.length; i++) {
            if (countA[i] > max) {
                max = countA[i];
                index = i;
            }
        }
        for (int i = 0; i < countA.length; i++) {
            if (countA[i] == max) {
                count++;
            }
        }
        if (count >= 2)
            System.out.println("?");
        else
            System.out.println((char) (index + 65));
    }
}