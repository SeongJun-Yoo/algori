
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[26];
        int max = 0;
        int cnt = 0;

        String STR = str.toUpperCase();
        for (int i = 0; i < STR.length(); i++) {

            count[STR.charAt(i) - 'A'] = count[STR.charAt(i) - 'A'] + 1;

        }

        char alpha = 0;
        for (int j = 0; j < 26; j++) {
            if (max < count[j]) {
                max = count[j];
                alpha = (char) (j + 'A');
            }
        }

        // ? 출력하게만들기
        for (int j = 0; j < 26; j++) {
            if (max == count[j]) {
                cnt++;
                if (cnt > 1) {
                    alpha = '?';
                }
            }
        }

        System.out.println(alpha);

    }
}