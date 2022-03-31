import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = new String[scan.nextInt()];
        scan.nextLine();

        int score;
        int total;

        for (int i = 0; i < str.length; i++) {
            total = 0;
            score = 0;
            str[i] = scan.nextLine();
            for(int j =0 ; j < str[i].length();j++){
                if(str[i].charAt(j) == 'O'){
                    score++;
                    total = total + score;
                }else if(str[i].charAt(j) == 'X'){
                    score = 0;
                }
               

            }
            System.out.println(total);

        }

    }

}