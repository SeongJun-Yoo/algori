import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String str1 = reader.readLine();
            String[] str = str1.split(" "); 
            String str2 = reader.readLine();
            int count = Integer.parseInt(str[0]);
            int num = Integer.parseInt(str[1]);
            String[] str3 = str2.split(" ");
            String ans = "";
            for(int i=0;i<count;i++){
                if(Integer.parseInt(str3[i])<num){
                    ans = ans + str3[i]  + " ";
                }
            }

            bw.write(ans);
            bw.newLine();

            bw.flush();
            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}