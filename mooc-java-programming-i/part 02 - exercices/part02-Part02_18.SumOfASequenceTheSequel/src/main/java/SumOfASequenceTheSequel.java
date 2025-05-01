
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        System.out.println("First number? ");
        int start=input.nextInt();
        System.out.println("Last number? ");
        int end=input.nextInt();

        for (int i=start ; i<=end ; i++){
            sum=sum+i;
        }
        System.out.println("The sum is "+sum);
    }
}
