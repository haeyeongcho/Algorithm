import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Character> set = new HashSet<>();
        String vowels = "aeiouAEIOU";

        vowels.chars().forEach(c -> set.add((char) c));

        while (true) {
            String input = br.readLine();
            if (input.equals("#")) {
                break;
            }

            int count = 0;

            for (int i = 0; i < input.length(); i++) {
                if (set.contains(input.charAt(i))) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}