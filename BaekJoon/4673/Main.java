import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10001; i++) {
            if (self(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static boolean self(int a) {

        for (int i = 1; i < a; i++) {
            int k = a - i;
            int m = a - i;
            int j = 0;
            while (k > 0) {
                j += k % 10;
                k = k / 10;
            }
            if (j != 0 && a == m + j)
                return false;
        }
        return true;
    }
}