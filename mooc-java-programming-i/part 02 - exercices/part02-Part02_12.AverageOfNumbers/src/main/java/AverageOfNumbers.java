
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

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
        double averageOfNumbers=(double)sum/inputCount;
        System.out.println("Average of the numbers: "+averageOfNumbers);
        


    }
}
