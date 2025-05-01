
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Give a number:");
            int number=input.nextInt();

            if(number==4){
                break;
            }
        }

    }
}
