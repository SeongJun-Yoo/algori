import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = A * (B%10);
        int D = A * ((B%100)/10);
        int E = A * ((B%1000)/100);
        int F = C + (D*10) + (E*100) ;

 

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);

 

    }

}