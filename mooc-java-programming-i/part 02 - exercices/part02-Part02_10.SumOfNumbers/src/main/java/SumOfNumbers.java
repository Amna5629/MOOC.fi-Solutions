
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;

        while(true){
            
            System.out.println("Give a number:");
            int number=input.nextInt();

            if (number==0){
                break;
            }

            sum=number+sum;
        }

        System.out.println("Sum of the numbers: "+sum);

    }
}
