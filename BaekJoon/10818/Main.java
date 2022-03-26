import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String st = reader.readLine();
            int count = Integer.parseInt(st);
            String num = reader.readLine();
            String[] number = num.split(" ");
            int max = Integer.parseInt(number[0]), min = Integer.parseInt(number[0]);
            for (int i = 0; i < count; i++) {
                if (max < Integer.parseInt(number[i])) {
                    max = Integer.parseInt(number[i]);
                }
                if (min > Integer.parseInt(number[i])) {
                    min = Integer.parseInt(number[i]);
                }
            }

            bw.write(min + " " + max);
            bw.newLine();

            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}