import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String time = reader.readLine();
            String pTime = reader.readLine();

            String[] str = time.split(" ");
            int H, M, PM;

            H = Integer.parseInt(str[0]);
            M = Integer.parseInt(str[1]);
            PM = Integer.parseInt(pTime);

            M = M + PM;
            while ((M / 60) > 0) {
                if (M >= 60) {
                    if (H == 23) {
                        H = 0;
                    } else {
                        H = H + 1;
                    }
                    M = M - 60;

                } else {

                }
            }
            System.out.print(H + " " + M);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}