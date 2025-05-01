
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Give a number:");
            int number=input.nextInt();

            if (number<0){
                System.out.println("Unsuitable number");
                continue;
            }else if (number==0){
                break;
            }else{
                int answer=number*number;
                System.out.println(answer);
            }
        }

    }
}
