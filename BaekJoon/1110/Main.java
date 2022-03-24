import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String num = reader.readLine();
            int total = Integer.parseInt(num);
            int first = Integer.parseInt(num);
            total = 26;
            int count = 0;
            boolean a = true;
            int num1 = 0;
            int num2 = 0;

            while (a) {
                num1 = total / 10;
                num2 = total % 10;
                if (num1 + num2 < 10) {
                    total = (num1 + num2) + num2;
                } else if((num1+num2)>=10){
                    total = ((num1 + num2) % 10) + num2;
                }
                count += 1;
                if (total == first) {
                    a = false;
                }
            }
            bw.write(Integer.toString(count));
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}