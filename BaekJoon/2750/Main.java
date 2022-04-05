import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = in.nextInt();
		}
 
	
		for(int i = 0; i < num - 1; i++) {
			for(int j = i + 1; j < num; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int val : arr) {
			System.out.println(val);
		}
 
	}

    

}