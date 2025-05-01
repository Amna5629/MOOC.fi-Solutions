
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Last number? ");
        int number=input.nextInt();
        int sum=0;
        for (int i=1 ; i<=number ; i++){
            sum=sum+i;
        }
        System.out.println("The sum is "+sum);
    }
}
