import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        bw.write(Integer.toString(mean(numbers)) + "\n");
        bw.write(Integer.toString(median(numbers)) + "\n");
        bw.write(Integer.toString(mode(numbers)) + "\n");
        bw.write(Integer.toString(range(numbers)) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int mean(int arr[]) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return Math.round((float) sum / arr.length);
    }

    public static int median(int arr[]) {
        return arr[arr.length / 2];
    }

    public static int mode(int arr[]) {
        int[] index = new int[8001];
        int max = 0;
        ArrayList<Integer> count = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            index[arr[i] + 4000]++;
            if (max < index[arr[i] + 4000]) {
                max = index[arr[i] + 4000];
            }
        }

        for (int i = 0; i < index.length; i++) {
            if (index[i] == max) {
                count.add(i - 4000);
            }
        }

        if (count.size() == 1) {
            return count.get(0);
        } else {
            return count.get(1);
        }
    }

    public static int range(int arr[]) {
        return arr[arr.length - 1] - arr[0];
    }
}