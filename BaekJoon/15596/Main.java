import java.util.Scanner;

public class Main {

 long sum(int[] a){
     long total = 0;
     for(int i = 0;i<a.length;i++){
         total = total + a[i];
     }
     return total;
 }

}