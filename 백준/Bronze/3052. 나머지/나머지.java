import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];
        int[] arr = new int[42];
        int result = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine()) % 42;
            arr[num[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                result++;
        }
        System.out.println(result);
    }
}
// 나머지가 서로 다른 수가 나올 경우의 수는 0~41 42가지
// 42개 크기의 배열을 선언한 뒤 나머지와 인덱스 번호를 일치시켜 저장한다
// ex) 나머지가 1 2 2 3 으로 나오면
// 0 1 2 1  > 배열에서 1이상인 인덱스 번호를 세면 서로 다른 값은 3개