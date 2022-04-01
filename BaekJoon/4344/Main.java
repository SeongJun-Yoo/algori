import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double avg = 0.0;
        int[] scores;
        scan.nextLine();
        for (int i = 0; i < num; i++) {
            int count = 0;
            int n = scan.nextInt();

            int total = 0;
            scores = new int[n];
            for (int j = 0; j < n; j++) {
                int score = scan.nextInt();
                scores[j] = score;
                total = total + score;
            }

            avg = (double) total / n;

            for (int j = 0; j < n; j++) {
                if ((double) scores[j] > avg) {
                    count++;
                }
            }
            double p = ((double) count / n) * 100.0;
            System.out.printf("%.3f", p);
            System.out.println("%");

        }

    }

}