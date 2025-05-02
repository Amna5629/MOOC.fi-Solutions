
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(input.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where? ");
        int start=input.nextInt();
        System.out.println("To where? ");
        int end=input.nextInt();

        for(int i=start;i<=end;i++){
            System.out.println(numbers.get(i));
        }

    }
}
