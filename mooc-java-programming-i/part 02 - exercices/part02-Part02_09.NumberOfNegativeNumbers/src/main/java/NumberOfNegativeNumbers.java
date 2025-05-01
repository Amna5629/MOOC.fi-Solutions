
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        
        while(true){
            
            System.out.println("Give a number:");
            int number=input.nextInt();

            if (number==0){
                break;
            }else if(number<0){
                sum++;
            }
        }

        System.out.println("Number of negative numbers: "+sum);
    }
}
