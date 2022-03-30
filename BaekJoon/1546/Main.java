import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] num = new double[scan.nextInt()];
        double M = 0;
        double total = 0;
        double avg = 0.0;
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            if (num[i] > M) {
                M = num[i];

            }
        }

        for (int i = 0; i < num.length; i++) {
            num[i] = (num[i] * 100) / M;
            total = total + num[i];

        }
        avg = total / (double) num.length;
        System.out.println(avg);

    }

}