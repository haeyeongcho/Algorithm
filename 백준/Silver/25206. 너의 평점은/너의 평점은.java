import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double scores = 0;
        double count = 0;

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            if (input[2].equals("P")) {
                continue;
            }
            switch (input[2]) {
                case "A+":
                    scores += 4.5 * Double.parseDouble(input[1]);
                    break;
                case "A0":
                    scores += 4.0 * Double.parseDouble(input[1]);
                    break;
                case "B+":
                    scores += 3.5 * Double.parseDouble(input[1]);
                    break;
                case "B0":
                    scores += 3.0 * Double.parseDouble(input[1]);
                    break;
                case "C+":
                    scores += 2.5 * Double.parseDouble(input[1]);
                    break;
                case "C0":
                    scores += 2.0 * Double.parseDouble(input[1]);
                    break;
                case "D+":
                    scores += 1.5 * Double.parseDouble(input[1]);
                    break;
                case "D0":
                    scores += Double.parseDouble(input[1]);
                    break;
                case "F":
                    scores += 0.0 * Double.parseDouble(input[1]);
                    break;
            }
            count += Double.parseDouble(input[1]);
        }
        System.out.println((float) (scores / count));
    }
}