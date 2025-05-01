
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int product=1;
        int number=input.nextInt();

        
        for (int i=1 ; i<=number ; i++){
            product*=i;
        }
        System.out.println("Factorial: "+product);
    }
}
