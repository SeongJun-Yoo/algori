import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        scan.nextLine();

        String str = scan.nextLine();
        int total = 0;

        for (int i = 0; i < count ; i++){
            total = total + Character.getNumericValue(str.charAt(i));
        }
        System.out.println(total);
    }
}