import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        boolean flag = false;
        
        for (int i = 1; i < input.length(); i++) {
            int A = 1;
            int B = 1;

            for (int j = 0; j < i; j++) {
                A *= Integer.parseInt(Character.toString(input.charAt(j)));
            }

            for (int j = i; j < input.length(); j++) {
                B *= Integer.parseInt(Character.toString(input.charAt(j)));
            }
            
            if (A == B) {
                flag = true;
                break;
            }
        }

        if (flag) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}