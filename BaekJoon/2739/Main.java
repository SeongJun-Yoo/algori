import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(reader.readLine());

            for(int i = 1; i <= 9 ; i ++){
                    System.out.println(num + " * " + i + " = " + (num*i));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}