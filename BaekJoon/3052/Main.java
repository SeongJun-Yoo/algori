import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            int[] num = new int[10];
            int cnt=0,count=0;
        for(int i = 0; i < 10 ; i++){
            num[i]=scan.nextInt() % 42;
        }
        for (int i=0;i<10;i++){
            cnt =0;
            for(int j = i+1;j<10;j++){
                if(num[i]==num[j]){
                    cnt ++;
                }
                
            }
            if ( cnt == 0 ){
                count ++;
            }
        }
        System.out.println(count);
    }

}