import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String count = reader.readLine();

            int num = Integer.parseInt(count);

            for (int i = 1; i <= num; i++) {
                for (int j = num; j > i ; j--) {
                    bw.write(" ");
                    
                }
                for (int j = 0 ; j<i;j++){
                    bw.write("*");
                }
                
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