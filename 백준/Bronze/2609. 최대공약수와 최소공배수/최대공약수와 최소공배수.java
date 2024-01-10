import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num1_ = num1;
        int num2_ = num2;

        int gcd = 1;
        int n = 0;
        for (int j = 0; j <num2; j++) {
            if (num1 > num2)
                n = num2;
            else
                n = num1;
            for (int i = 1; i <= n; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    num1 /= i;
                    num2 /= i;
                    gcd *= i;
                }
            }
        }
        int lcm = 1;
        int count1 = num1_;
        int count2 = num2_;
        while(num1_ != num2_){
            if (num1_ > num2_) {
                num2_ += count2;
            } else if (num1_ < num2_) {
                num1_+= count1;
            }
        }
        lcm = num1_;
        bw.write(Integer.toString(gcd));
        bw.newLine();
        bw.write(Integer.toString(lcm));

        bw.flush();
        bw.close();
        br.close();
    }
}