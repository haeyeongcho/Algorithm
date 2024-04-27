import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String input;

        while ((input = br.readLine()) != null) {
            if (input.equals("")) {
                break;
            }
            int lower = 0;
            int upper = 0;
            int number = 0;
            int blank = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isLowerCase(ch)) {
                    lower++;
                } else if (Character.isUpperCase(ch)) {
                    upper++;
                } else if (Character.isDigit(ch)) {
                    number++;
                } else if (Character.isWhitespace(ch)) {
                    blank++;
                }
            }
            bw.write(lower + " " + upper + " " + number + " " + blank + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}