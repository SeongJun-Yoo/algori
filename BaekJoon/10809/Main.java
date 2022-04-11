import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        firstAlpha(S);

    }

    static void firstAlpha(String str){
        int[] numbers = new int[26];
        for(int count = 0;count <26;count++){
            numbers[count] = -1;

        }
        for(int i = 0; i<str.length();i++){
            if(numbers[(int)str.charAt(i)-'a'] == -1) {
                numbers[(int) str.charAt(i) - 'a'] = i;
            }

        }
        for(int j = 0;j <26;j++){
            System.out.print(numbers[j] + " ");
        }

    }
}
