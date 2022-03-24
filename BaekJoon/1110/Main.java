import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
            int num = Integer.parseInt(reader.readLine());
            int total = num;
            int count = 0;
         
            int num1 = 0;
            int num2 = 0;
            boolean a = true;
            while (a) {
               total = ((total % 10)*10) + (((total / 10)+(total %10)) % 10);
                count++;
                if(total == num){
                    a = false;
                }
               
            }
            System.out.print(count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}