
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number=input.nextInt();
        for(int i = number ; i<=100;i++){
            System.out.println(i);
        }

    }
}
