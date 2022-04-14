import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String str1 = reader.readLine();
            String[] str = str1.split(" ");
            int [] num = new int[2]; 
            for (int i = 0; i < 2 ; i ++ ){
                String tmp = "";
                for(int j = str[i].length()-1 ;j >= 0; j--){
                    tmp = tmp + str[i].charAt(j);
                }
                str[i] = tmp;
            }
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            if (a > b){
                System.out.println(a);
            }else if ( b > a){
                System.out.println(b);
            }
           

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}