import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        
        double A = Double.parseDouble(input1[0]);
        double B = Double.parseDouble(input1[1]);
        double C = Double.parseDouble(input2[0]);
        double D = Double.parseDouble(input2[1]);

        double rotation_0 = A / C + B / D;
        double rotation_1 = C / D + A / B;
        double rotation_2 = D / B + C / A;
        double rotation_3 = B / A + D / C;

        double[] rotations = {rotation_0, rotation_1, rotation_2, rotation_3};
        int maxIndex = 0;
        double maxValue = rotations[0];

        for (int i = 1; i < rotations.length; i++) {
            if (rotations[i] > maxValue) {
                maxValue = rotations[i];
                maxIndex = i;
            }
        }

        bw.write(String.valueOf(maxIndex));

        bw.flush();
        bw.close();
        br.close();
    }
}
