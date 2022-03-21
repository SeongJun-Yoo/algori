import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String count = reader.readLine();
            int num = Integer.parseInt(count);
            for (int i = num; i > 0; i--) {
                bw.write(Integer.toString(i));
                bw.newLine();
            }

            bw.flush();
            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}