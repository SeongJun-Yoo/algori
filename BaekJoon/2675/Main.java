
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String P = "";

        for (int i = 0; i < count ; i++) {

            String S = sc.nextLine();
            String[] str = S.split(" ");
            int R = Integer.parseInt(str[0]);
            String RStr = str[1];
            P = repeatString(R, RStr);
            System.out.println(P);
        }


    }

    static String repeatString(int cnt,String str){
        String Q = "";
        for(int i = 0; i < str.length() ; i++) {
            for (int j = 0 ; j < cnt ; j++){
                Q = Q + str.charAt(i);
            }

        }
        return Q;
    }
}