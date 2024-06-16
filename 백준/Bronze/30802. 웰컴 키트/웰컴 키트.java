import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String[] bundle = br.readLine().split(" ");
        int T = Integer.parseInt(bundle[0]);
        int P = Integer.parseInt(bundle[1]);

        int t_bundle = 0;

        // 각 사이즈별 티셔츠 수를 배열에 저장
        int[] sizes = new int[6];
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        // 티셔츠 묶음 계산
        for (int i = 0; i < 6; i++) {
            t_bundle += (sizes[i] + T - 1) / T;  // 필요한 묶음 수 계산
        }

        // 펜 묶음 계산
        int p_bundle1 = N / P;  // 최대한 많은 묶음 수
        int p_bundle2 = N % P;  // 남은 펜의 수

        // 결과 출력
        bw.write(t_bundle + "\n");
        bw.write(p_bundle1 + " " + p_bundle2);

        bw.flush();
        bw.close();
        br.close();
    }
}