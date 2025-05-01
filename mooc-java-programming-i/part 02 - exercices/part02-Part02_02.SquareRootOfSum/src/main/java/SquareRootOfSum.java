
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1=input.nextInt();
        int number2=input.nextInt();
     
        double squareRoot = Math.sqrt(number1+number2);
        System.out.println(squareRoot);
    }
}
