import java.util.HashMap;
import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            HashMap<Integer, Double> score_map = new HashMap<>();
            int student = sc.nextInt();
            int idx = sc.nextInt();
            int grade = 0;

            for (int i = 1; i <= student; i++) {
                int mid_exam = sc.nextInt();
                int final_exam = sc.nextInt();
                int homework = sc.nextInt();
                double score = mid_exam * 0.35 + final_exam * 0.45 + homework * 0.2;
                score_map.put(i, score);
            }

            for (int i = 1; i <= score_map.size(); i++) {
                if (score_map.get(i) < score_map.get(idx)) {
                    grade++;
                }
            }

            System.out.print("#" + test_case + " ");

            switch(grade / (student / 10)){
                case 0:
                    System.out.print("D0");
                    break;
                case 1:
                    System.out.println("C-");
                    break;
                case 2:
                    System.out.println("C0");
                    break;
                case 3:
                    System.out.println("C+");
                    break;
                case 4:
                    System.out.println("B-");
                    break;
                case 5:
                    System.out.println("B0");
                    break;
                case 6:
                    System.out.println("B+");
                    break;
                case 7:
                    System.out.println("A-");
                    break;
                case 8:
                    System.out.println("A0");
                    break;
                case 9:
                    System.out.println("A+");
                    break;
                default:
                    break;
            }
        }
    }
}