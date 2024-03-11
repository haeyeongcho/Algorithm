import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] arr = new int[input.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (input.charAt(i) - 48);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i : arr) {
            bw.write(Integer.toString(i));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}