import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a+b);
        }
        sc.close();
    }
}
