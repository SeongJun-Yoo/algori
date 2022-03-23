import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int total = 0;
            String str1 = "";
            String[] str;
            while (true) {
                str1 = reader.readLine();
                str = str1.split(" ");
                if (str[0].equals("0") && str[1].equals("0")) {
                    break;
                }
                
                total = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
                bw.write(Integer.toString(total));
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