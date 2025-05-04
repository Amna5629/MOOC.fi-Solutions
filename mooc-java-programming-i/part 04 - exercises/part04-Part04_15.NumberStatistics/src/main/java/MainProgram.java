
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Step 1: Create the three Statistics objects in the correct order
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        System.out.println("Enter numbers:");

        // Step 2: Read input until -1
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }

            // Step 3: Add number to allNumbers
            allNumbers.addNumber(number);

            // Step 4: Check if even or odd and add accordingly
            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }

        // Step 5: Print the results
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}