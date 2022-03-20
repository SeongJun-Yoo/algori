import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String time = reader.readLine();
            String[] str = time.split(" ");
            int H, M;

            H = Integer.parseInt(str[0]);
            M = Integer.parseInt(str[1]);

            M = M - 45;

            if (M < 0) {
                if (H < 1) {
                    H = 23;
                } else {
                    H = H - 1;
                }
                M = M + 60;

                System.out.print(H + " " + M);
            } else {
                System.out.print(H + " " + M);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}