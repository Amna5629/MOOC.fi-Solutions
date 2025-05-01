
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1=input.nextInt();
        int number2=input.nextInt();

        if(number1>number2){
            System.out.println(number1+" is greater than "+number2);
        }else if (number1<number2){
            System.out.println(number1+" is smaller than "+number2);
        }else{
            System.out.println(number2+" is equal to "+number1);
        }

    }
}
