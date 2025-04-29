
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");

        String user_input=input.nextLine();

        System.out.println("Hi"+" "+ user_input);

    }
}
