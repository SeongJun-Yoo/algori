import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           
            int max = 0, count = 0;
            String[] nStr = new String[9]; 
            for (int i = 0; i<9;i++){
                nStr[i]= reader.readLine();
            }
            

            for ( int j = 0; j<9;j++){
                if(max<Integer.parseInt(nStr[j])){
                    count = j+1;
                    max = Integer.parseInt(nStr[j]);
                }
            }
           System.out.println(max);
           System.out.println(count);

    
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}