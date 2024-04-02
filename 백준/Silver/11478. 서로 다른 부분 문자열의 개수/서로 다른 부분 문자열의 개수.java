import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        HashSet<String> set = new HashSet<>();
        int count = 0;
        int range = 1;
        int n = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length()-n; j++) {
                if (set.contains(input.substring(j, j + range))) {
                    continue;
                } else {
                    set.add(input.substring(j, j + range));
                    count++;
                }
            }
            range++;
            n++;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}