import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int binarySearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] N_arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            N_arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(N_arr);

        int M = Integer.parseInt(br.readLine());
        int[] M_arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            M_arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            if (binarySearch(N_arr, M_arr[i]) >= 0) {
                bw.write(Integer.toString(1));
                bw.newLine();
            } else {
                bw.write(Integer.toString(0));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}