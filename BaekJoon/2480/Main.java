import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String dice = reader.readLine();
            String[] str = dice.split(" ");
            int num1, num2, num3, money;
            
            num1 = Integer.parseInt(str[0]);
            num2 = Integer.parseInt(str[1]);
            num3 = Integer.parseInt(str[2]);
            money = 0;

            if(num1 == num2 && num1 == num3){
                money = 10000 + (num1 * 1000);
            }else if(num1 == num2 && num1 != num3){
                money = 1000 + (num1 * 100);
            }else if(num2 == num3 && num1 != num2){
                money = 1000 + (num2 * 100);
            }else if(num1 == num3 && num1 != num2){
                money = 1000 + (num1 * 100);
            }else if(num1 > num2 && num1 > num3){
                money = 100 * num1;
            }else if(num2 > num1 && num2 > num3){
                money = 100 * num2;
            }else if(num3 > num2 && num3 > num1){
                money = 100 * num3;
            }

            System.out.print(money);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}