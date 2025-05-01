
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("How many times?");
        int number= input.nextInt();
        int count=0;
        while(count<number){
            printText();
            count++;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
