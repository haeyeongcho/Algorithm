import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] alphabet = new int[26];
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            alphabet[name.charAt(0) - 'a']++;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] >= 5) {
                list.add(String.valueOf(Character.toChars((i + 97))));
            }
        }

        Collections.sort(list);

        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i));
            }
        } else {
            bw.write("PREDAJA");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}