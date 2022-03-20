import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(reader.readLine());
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            String str1 = "";
            String[] str2;
            String str3 = "";
            for (int i = 0; i < num; i++) {
                str1 = reader.readLine();
                str2 = str1.split(" ");

                num1 = Integer.parseInt(str2[0]);
                num2 = Integer.parseInt(str2[1]);
                num3 = num1 + num2;
                str3 = str3 + num3 + "\n";
            }
            System.out.println(str3);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}