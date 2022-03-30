import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] num = new int[cnt];
        int M = 0;
        int total = 0;
        double avg = 0.0;
        for (int i = 0; i<cnt;i++){
            num[i] = scan.nextInt();
      
            if (num[i]>M){
                M = num[i];
         
            }
        }
    
        for (int i = 0; i < cnt ; i++){
            num[i] =  (num[i] *100)/M ;
            total = total + num[i];
           
        }
        avg = total/cnt;
       System.out.println(avg);

    }

}