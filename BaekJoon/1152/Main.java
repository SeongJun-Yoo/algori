import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        try {
            String[] word = str.split(" ");

            int count = word.length;
            if (str.equals(null)) {
                count = 0;
            } else if (word[0].equals("")) {
                count = count - 1;
            }

            System.out.println(count);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("0");
        }
    }
}