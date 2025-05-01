
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int inputCount=0;

        while(true){
            
            System.out.println("Give a number:");
            int number=input.nextInt();

            if (number==0){
                break;
            }

            sum=number+sum;
            inputCount++;
        }
        System.out.println("Number of numbers: "+inputCount);
        System.out.println("Sum of the numbers: "+sum);

    }
}
