import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();
        String input2 = br.readLine();
        String input3 = br.readLine();
        int number = 0;

        if (isNumeric(input1)) {
            number = Integer.parseInt(input1) + 3;
        } else if (isNumeric(input2)) {
            number = Integer.parseInt(input2) + 2;
        } else if (isNumeric(input3)) {
            number = Integer.parseInt(input3) + 1;
        }

        if (number % 3 == 0 && number % 5 == 0) {
            bw.write("FizzBuzz");
        } else if (number % 3 == 0 && number % 5 != 0) {
            bw.write("Fizz");
        } else if (number % 3 != 0 && number % 5 == 0) {
            bw.write("Buzz");
        } else if (number % 3 != 0 && number % 5 != 0) {
            bw.write(number + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
    public static boolean isNumeric(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}