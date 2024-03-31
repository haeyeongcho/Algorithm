import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashMap<String, String> nameToNumber = new HashMap<>();
        HashMap<String, String> numberToName = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            String number = String.valueOf(i);
            nameToNumber.put(name, number);
            numberToName.put(number, name);
        }

        for (int i = 0; i < m; i++) {
            String result = br.readLine();
            if (Character.isDigit(result.charAt(0))) {
                bw.write(numberToName.get(result) + "\n");
            } else {
                bw.write(nameToNumber.get(result) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}