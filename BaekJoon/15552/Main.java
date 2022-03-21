import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String count = reader.readLine();
           
            int num1, num2, total;
            String ans = "";

           

            for(int i=0;i<Integer.parseInt(count);i++){
                String str = reader.readLine();
                String[] num = str.split(" ");
                num1 = Integer.parseInt(num[0]);
                num2 = Integer.parseInt(num[1]);
                total = num1 + num2;
                ans =  Integer.toString(total);
                bw.write(ans);
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