import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        if (N < 100) {
            result = N;
        } else {
            result = 99;
            for (int i = 100; i <= N; i++) {
                String temp = Integer.toString(i);
                boolean flag = true;
                for (int j = 0; j < temp.length() - 2; j++) {
                    int num = Character.getNumericValue(temp.charAt(j)) -
                            Character.getNumericValue(temp.charAt(j + 1));
                    if (num != Character.getNumericValue(temp.charAt(j + 1)) -
                            Character.getNumericValue(temp.charAt(j + 2))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result++;
                }
            }
        }

        bw.write(result + "\n");
        bw.close();
        br.close();
    }
}